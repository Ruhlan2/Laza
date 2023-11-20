package com.ruhlanusubov.lazae_commerce.service

import com.ruhlanusubov.lazae_commerce.model.category.CategoryResponse
import com.ruhlanusubov.lazae_commerce.model.product.Product
import com.ruhlanusubov.lazae_commerce.model.product.ProductResponse
import retrofit2.Call
import retrofit2.http.GET

interface Service {
    @GET("products")
    fun getProduct():Call<ProductResponse>

    @GET("products/categories")
    fun getCategory():Call<CategoryResponse>

}