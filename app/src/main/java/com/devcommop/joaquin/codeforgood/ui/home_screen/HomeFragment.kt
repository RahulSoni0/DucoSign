package com.devcommop.joaquin.codeforgood.ui.home_screen

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.devcommop.joaquin.codeforgood.R
import com.devcommop.joaquin.codeforgood.databinding.ActivityMainBinding
import com.devcommop.joaquin.codeforgood.databinding.FragmentHomeBinding
import nl.joery.animatedbottombar.AnimatedBottomBar

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

}