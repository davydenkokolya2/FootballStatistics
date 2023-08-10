package com.example.footballstatistics.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.footballstatistics.databinding.FragmentOnboardingBinding
import com.example.footballstatistics.ui.NavigationScreenViewModel
import com.example.footballstatistics.util.ScreenNavigation

class OnboardingFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        binding.btnTVRule2.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.START)
        }
        return binding.root
    }
}