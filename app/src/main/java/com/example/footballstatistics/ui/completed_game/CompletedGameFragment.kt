package com.example.footballstatistics.ui.completed_game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.footballstatistics.databinding.FragmentCompletedGameBinding
import com.example.footballstatistics.ui.NavigationScreenViewModel
import com.example.footballstatistics.util.ScreenNavigation

class CompletedGameFragment : Fragment() {

    private lateinit var binding: FragmentCompletedGameBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCompletedGameBinding.inflate(inflater, container, false)
        binding.btnFirstCard.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.INTUITION_POINTS)
        }
        binding.btnRandomChoice.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.INTUITION_POINTS)
        }
        binding.btnCompletedGameBack.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.RULE)
        }
        return binding.root
    }
}