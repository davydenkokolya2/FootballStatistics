package com.example.footballstatistics.ui.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.example.footballstatistics.databinding.FragmentGameBinding
import com.example.footballstatistics.ui.NavigationScreenViewModel
import com.example.footballstatistics.util.ScreenNavigation
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(inflater, container, false)

        binding.btnChronology.setOnClickListener {
            binding.clGameSecond.visibility = View.VISIBLE
            binding.clGameFirst.visibility = View.INVISIBLE
            lifecycleScope.launch {
                for (i in 7 downTo 0) {
                    when(i) {
                        7 -> binding.ivGameCard1.visibility = View.VISIBLE
                        6 -> binding.ivGameCard2.visibility = View.VISIBLE
                        5 -> binding.ivGameCard3.visibility = View.VISIBLE
                        4 -> binding.ivGameCard4.visibility = View.VISIBLE
                        3 -> binding.ivGameCard5.visibility = View.VISIBLE
                        2 -> binding.ivGameCard6.visibility = View.VISIBLE
                        1 -> binding.ivGameCard7.visibility = View.VISIBLE
                        0 -> binding.ivGameCard8.visibility = View.VISIBLE
                    }
                    delay(2000)
                }
            }
        }
        binding.btnGameBack.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.LEAGUE)
        }

        return binding.root
    }
}