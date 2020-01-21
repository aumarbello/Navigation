package com.aumarbello.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.aumarbello.navigation.databinding.FragmentHomeBinding

class HomeFragment: Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentHomeBinding.bind(view)
        binding.action.setOnClickListener {
            findNavController().navigate(NavGraphXmlDirections.toProducts(Product("Biscuits")))
        }
    }
}