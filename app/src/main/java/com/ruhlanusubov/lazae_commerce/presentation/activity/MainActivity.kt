package com.ruhlanusubov.lazae_commerce.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ruhlanusubov.lazae_commerce.R
import com.ruhlanusubov.lazae_commerce.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        setup()
    }
    private fun setup(){

        val navHost=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController=navHost.navController

        NavigationUI.setupWithNavController(binding.bottomNavigationView,navController)

       navController.addOnDestinationChangedListener{_,destination,_->

           when(destination.id){
               R.id.splashFragment,
               R.id.loginFragment,
               R.id.registerFragment,
               R.id.getStartedFragment,
               R.id.startFragment->{
                   binding.bottomNavigationView.visibility= View.GONE
               }else->{
                   if(binding.bottomNavigationView.visibility==View.GONE){
                       binding.bottomNavigationView.visibility=View.VISIBLE
                   }
               }
           }

       }
    }
}