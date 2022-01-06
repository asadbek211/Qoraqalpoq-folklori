package com.bizmiz.qoraqalpoqfolklori.fragments.pdf_open

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
import com.bizmiz.milliyoyinlar.utils.pdfList
import com.bizmiz.qoraqalpoqfolklori.R
import com.bizmiz.qoraqalpoqfolklori.databinding.FragmentAsarlarBinding
import com.bizmiz.qoraqalpoqfolklori.databinding.FragmentPdfOpenBinding
import com.gita.allomalar.adapter.ItemAdapter

class PdfOpenFragment : Fragment() {
    private lateinit var binding: FragmentPdfOpenBinding
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        val position = requireArguments().getInt("position")
        requireActivity().window.decorView.windowInsetsController?.setSystemBarsAppearance(
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
        )
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(),R.color.white)
        binding = FragmentPdfOpenBinding.bind(inflater.inflate(R.layout.fragment_pdf_open, container, false))
        binding.pdfView.fromAsset("${
            pdfList[position]}.pdf").load()
        return binding.root
    }
}