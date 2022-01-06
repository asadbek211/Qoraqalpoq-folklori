package com.bizmiz.qoraqalpoqfolklori.fragments.asarlar

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import com.bizmiz.qoraqalpoqfolklori.R
import com.bizmiz.qoraqalpoqfolklori.databinding.FragmentAsarlarBinding
import com.gita.allomalar.adapter.ItemAdapter

class AsarlarFragment : Fragment() {
    private lateinit var binding: FragmentAsarlarBinding
    private lateinit var itemAdapter: ItemAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(),R.color.title)
        binding = FragmentAsarlarBinding.bind(inflater.inflate(R.layout.fragment_asarlar, container, false))
        itemAdapter = ItemAdapter()
        binding.recView.adapter = itemAdapter
        itemAdapter.setOnclickListener { position ->
            val bundle = bundleOf(
                "position" to position
            )
            val navController = Navigation.findNavController(requireActivity(),R.id.fragmentContainer)
            navController.navigate(R.id.action_asarlarFragment_to_pdfOpenFragment,bundle)

        }
        return binding.root
    }
}