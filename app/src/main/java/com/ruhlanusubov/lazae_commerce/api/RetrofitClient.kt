package com.ruhlanusubov.lazae_commerce.api

import com.ruhlanusubov.lazae_commerce.utils.Const.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object{
        fun getClient(baseUrl:String):Retrofit{
            return Retrofit.Builder().
            baseUrl(BASE_URL).
            addConverterFactory(GsonConverterFactory.create()).
            build()
        }
    }
}