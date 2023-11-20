package com.ruhlanusubov.lazae_commerce.presentation.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.ruhlanusubov.lazae_commerce.R
import com.ruhlanusubov.lazae_commerce.adapter.BrandAdapter
import com.ruhlanusubov.lazae_commerce.adapter.ProductAdapter
import com.ruhlanusubov.lazae_commerce.api.ApiUtils
import com.ruhlanusubov.lazae_commerce.databinding.FragmentHomeBinding
import com.ruhlanusubov.lazae_commerce.model.category.CategoryResponse
import com.ruhlanusubov.lazae_commerce.model.product.ProductResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {

    private var _binding:FragmentHomeBinding?=null
    private val binding get() = _binding!!
    private val service=ApiUtils.getService()
    private val product=ProductAdapter()
    private val category=BrandAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        brandData()
        productData()
        adapter()


    }
    private fun brandData(){
        service.getCategory().enqueue(object:Callback<CategoryResponse>{
            override fun onResponse(
                call: Call<CategoryResponse>,
                response: Response<CategoryResponse>
            ) {
               if(response.isSuccessful){
                   category.updateList(response.body()?: emptyList())
                  /* response.body()?.let {
                       category.updateList(it)
                   }
                   */
               }else{
                   Toast.makeText(requireContext(),"Error",Toast.LENGTH_SHORT).show()
               }
            }

            override fun onFailure(call: Call<CategoryResponse>, t: Throwable) {
                Toast.makeText(requireContext(),"Failure",Toast.LENGTH_SHORT).show()
            }

        })
    }
    private fun productData(){
        service.getProduct().enqueue(object :Callback<ProductResponse>{
            override fun onResponse(
                call: Call<ProductResponse>,
                response: Response<ProductResponse>
            ) {
                if(response.isSuccessful){
                    response.body()?.let {
                        product.updateList(it.products?: emptyList())
                    }
                }else{
                    Toast.makeText(requireContext(),"Error",Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                Toast.makeText(requireContext(),"Failure",Toast.LENGTH_SHORT).show()
            }

        })
    }

    private fun adapter(){
        with(binding.productRv){
            adapter=product
            layoutManager=GridLayoutManager(requireContext(),2,GridLayoutManager.VERTICAL,false)
        }
        with(binding.brandRv){
            adapter=category
            layoutManager=GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}