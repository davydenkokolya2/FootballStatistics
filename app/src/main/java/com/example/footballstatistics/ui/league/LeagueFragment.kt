package com.example.footballstatistics.ui.league

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.footballstatistics.databinding.FragmentLeagueBinding
import com.example.footballstatistics.ui.NavigationScreenViewModel
import com.example.footballstatistics.util.ScreenNavigation
import kotlin.random.Random

class LeagueFragment : Fragment() {

    private lateinit var binding: FragmentLeagueBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLeagueBinding.inflate(inflater, container, false)
        if (Random.nextBoolean())
            binding.ivRest.visibility = View.VISIBLE
        binding.btnNOFVSud.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.GAME)
        }
        binding.btnBack.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.START)
        }
        return binding.root
    }
}