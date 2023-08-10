package com.example.footballstatistics.ui.point_history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.footballstatistics.databinding.FragmentPointHistoryBinding
import com.example.footballstatistics.ui.NavigationScreenViewModel
import com.example.footballstatistics.util.ScreenNavigation

class PointHistoryFragment : Fragment() {

    private lateinit var binding: FragmentPointHistoryBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPointHistoryBinding.inflate(inflater, container, false)
        binding.btnBadGuesses.setOnClickListener {
            binding.btnGoodGuesses.visibility = View.VISIBLE
            binding.btnBadGuesses.visibility = View.INVISIBLE
        }
        binding.btnGoodGuesses.setOnClickListener {
            binding.btnGoodGuesses.visibility = View.INVISIBLE
            binding.btnBadGuesses.visibility = View.VISIBLE
        }
        binding.btnPointHistoryCard1.setOnClickListener {
            if (binding.clPointHistoryCards.visibility == View.VISIBLE) {
                binding.clPointHistoryTable.visibility = View.VISIBLE
                binding.clPointHistoryCards.visibility = View.INVISIBLE
            } else {
                binding.clPointHistoryTable.visibility = View.INVISIBLE
                binding.clPointHistoryCards.visibility = View.VISIBLE
            }
        }
        binding.btnBack4.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.INTUITION_POINTS)
        }
        return binding.root
    }
}