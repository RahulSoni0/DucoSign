package com.devcommop.joaquin.codeforgood.ui.login_screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.devcommop.joaquin.codeforgood.R
import com.devcommop.joaquin.codeforgood.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentLoginBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}