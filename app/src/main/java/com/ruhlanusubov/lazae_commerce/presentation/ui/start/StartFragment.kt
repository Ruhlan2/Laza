package com.ruhlanusubov.lazae_commerce.presentation.ui.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.ruhlanusubov.lazae_commerce.R
import com.ruhlanusubov.lazae_commerce.databinding.FragmentSplashBinding
import com.ruhlanusubov.lazae_commerce.databinding.FragmentStartBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StartFragment : Fragment() {
    private var _binding: FragmentStartBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentStartBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


     }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}
