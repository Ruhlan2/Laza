package com.ruhlanusubov.lazae_commerce.presentation.ui.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ruhlanusubov.lazae_commerce.R
import com.ruhlanusubov.lazae_commerce.databinding.FragmentGetStartedBinding
import com.ruhlanusubov.lazae_commerce.databinding.FragmentStartBinding

class GetStartedFragment : Fragment() {
    private var _binding: FragmentGetStartedBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentGetStartedBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }
    private fun setup(){
        with(binding){
            createBtn.setOnClickListener {
                findNavController().navigate(GetStartedFragmentDirections.actionGetStartedFragmentToLoginFragment())
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}