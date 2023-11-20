package com.ruhlanusubov.lazae_commerce.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ruhlanusubov.lazae_commerce.databinding.ItemBrandBinding
import com.ruhlanusubov.lazae_commerce.model.category.CategoryResponse

class BrandAdapter: RecyclerView.Adapter<BrandAdapter.BrandHolder>() {

    private val brandList=ArrayList<String>()

    inner class BrandHolder(val binding:ItemBrandBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandHolder {
        val layout=ItemBrandBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BrandHolder(layout)
    }

    override fun getItemCount(): Int {
        return brandList.size
    }

    override fun onBindViewHolder(holder: BrandHolder, position: Int) {
        val item=brandList[position]
        with(holder.binding){
           categoryName.text=item
       }
    }

    fun updateList(list: List<String>){
        brandList.clear()
        brandList.addAll(list)
        notifyDataSetChanged()
    }
}