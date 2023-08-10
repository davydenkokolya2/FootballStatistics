package com.example.footballstatistics.ui.full_information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.footballstatistics.databinding.FragmentFullInformationBinding
import com.example.footballstatistics.ui.NavigationScreenViewModel
import com.example.footballstatistics.util.ScreenNavigation

class FullInformationFragment : Fragment() {

    private lateinit var binding: FragmentFullInformationBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFullInformationBinding.inflate(inflater, container, false)
        binding.btnBack5.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.INTUITION_POINTS)
        }
        return binding.root
    }
}