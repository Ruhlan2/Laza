package com.ruhlanusubov.lazae_commerce.api

import com.ruhlanusubov.lazae_commerce.service.Service
import com.ruhlanusubov.lazae_commerce.utils.Const.BASE_URL

class ApiUtils {
    companion object{
        fun getService():Service{
            return RetrofitClient.getClient(BASE_URL).create(Service::class.java)
        }
    }
}