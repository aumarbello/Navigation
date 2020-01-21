package com.aumarbello.products

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.aumarbello.products.databinding.FragmentProductBinding

class ProductFragment: Fragment(R.layout.fragment_product) {
    private val args by navArgs<ProductFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentProductBinding.bind(view)
        binding.name.text = args.product.name
    }
}