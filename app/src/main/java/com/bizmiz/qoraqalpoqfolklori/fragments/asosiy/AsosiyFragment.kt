package com.bizmiz.qoraqalpoqfolklori.fragments.asosiy

import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsetsController
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.bizmiz.qoraqalpoqfolklori.R
import com.bizmiz.qoraqalpoqfolklori.databinding.FragmentAsosiyBinding

class AsosiyFragment : Fragment() {
    private lateinit var binding: FragmentAsosiyBinding
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(),R.color.title2)
        requireActivity().window.decorView.windowInsetsController?.setSystemBarsAppearance(
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
        )
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(),R.color.title2)
        binding = FragmentAsosiyBinding.bind(inflater.inflate(R.layout.fragment_asosiy, container, false))
       binding.nextBtn.setOnClickListener {
       val navController = Navigation.findNavController(requireActivity(),R.id.fragmentContainer)
           navController.navigate(R.id.action_asosiyFragment_to_asarlarFragment)
       }
        return binding.root
    }
}