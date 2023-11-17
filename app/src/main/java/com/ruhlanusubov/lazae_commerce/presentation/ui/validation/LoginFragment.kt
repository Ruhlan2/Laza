package com.ruhlanusubov.lazae_commerce.presentation.ui.validation

import android.os.Bundle
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ruhlanusubov.lazae_commerce.R
import com.ruhlanusubov.lazae_commerce.databinding.FragmentLoginBinding
import com.ruhlanusubov.lazae_commerce.databinding.FragmentStartBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup(){
        /*
        with(binding){

            val text=terms.text
            val spannableString=SpannableString(text)

            val clickableSpan=object :ClickableSpan(){
                override fun onClick(p0: View) {
                    //terms
                }

            }
            spannableString.setSpan(
                clickableSpan,
                text.indexOf("Terms and Conditions"),
                text.indexOf("Terms and Conditions")+"Terms and Conditions".length,
                0)

            terms.text=spannableString
            terms.movementMethod=LinkMovementMethod.getInstance()
        }

         */
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}