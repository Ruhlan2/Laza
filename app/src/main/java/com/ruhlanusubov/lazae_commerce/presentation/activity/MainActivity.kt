package com.ruhlanusubov.lazae_commerce.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ruhlanusubov.lazae_commerce.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}