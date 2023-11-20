package com.ruhlanusubov.lazae_commerce.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ruhlanusubov.lazae_commerce.databinding.ItemProductBinding
import com.ruhlanusubov.lazae_commerce.model.product.Product

class ProductAdapter: RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    private val productList=ArrayList<Product>()
    inner class ProductHolder(val binding:ItemProductBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val layout=ItemProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductHolder(layout)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val item=productList[position]
        with(holder.binding){
            Glide.with(holder.itemView.context).load(item.thumbnail).into(productImg)
            productTitle.text=item.title
            productPrice.text="$${item.price}"
        }

    }
    fun updateList(list: List<Product>){
        productList.clear()
        productList.addAll(list)
        notifyDataSetChanged()
    }

}