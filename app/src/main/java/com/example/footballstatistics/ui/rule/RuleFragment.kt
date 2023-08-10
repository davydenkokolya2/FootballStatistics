package com.example.footballstatistics.ui.rule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.footballstatistics.databinding.FragmentRuleBinding
import com.example.footballstatistics.ui.NavigationScreenViewModel
import com.example.footballstatistics.util.ScreenNavigation

class RuleFragment : Fragment() {

    private lateinit var binding: FragmentRuleBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRuleBinding.inflate(inflater, container, false)
        binding.btnRuleBack.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.START)
        }
        binding.btnTVRule.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.COMPLETED_GAME)
        }
        return binding.root
    }
}