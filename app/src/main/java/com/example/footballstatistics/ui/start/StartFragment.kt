package com.example.footballstatistics.ui.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.footballstatistics.databinding.FragmentStartBinding
import com.example.footballstatistics.ui.NavigationScreenViewModel
import com.example.footballstatistics.util.ScreenNavigation

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        binding.btnLeague.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.LEAGUE)
        }
        binding.btnRule.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.RULE)
        }
        return binding.root
    }

}