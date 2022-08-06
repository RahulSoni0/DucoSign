package com.devcommop.joaquin.codeforgood.ui.donation_screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devcommop.joaquin.codeforgood.R
import com.devcommop.joaquin.codeforgood.databinding.FragmentDonationsBinding

class DonationsFragment : Fragment(R.layout.fragment_donations) {
    private var _binding: FragmentDonationsBinding? = null
    val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDonationsBinding.bind(view)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}