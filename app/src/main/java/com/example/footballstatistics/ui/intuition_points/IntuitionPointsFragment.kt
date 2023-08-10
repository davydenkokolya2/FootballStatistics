package com.example.footballstatistics.ui.intuition_points

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.footballstatistics.databinding.FragmentIntuitionPointsBinding
import com.example.footballstatistics.ui.NavigationScreenViewModel
import com.example.footballstatistics.util.Intuition
import com.example.footballstatistics.util.ScreenNavigation

class IntuitionPointsFragment : Fragment() {

    private lateinit var binding: FragmentIntuitionPointsBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by activityViewModels()
    private val intuitionPointsViewModel: IntuitionPointsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIntuitionPointsBinding.inflate(inflater, container, false)
        binding.btnFullInformation.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.FULL_INFORMATION)
        }
        binding.btnPointHistory.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.POINT_HISTORY)
        }
        binding.btnFullInformation.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.FULL_INFORMATION)
        }
        binding.imageView38.setOnClickListener {
            binding.ivFullTable.visibility = View.VISIBLE
            binding.btnPointHistory.visibility = View.INVISIBLE
            binding.btnPointHistoryTranslucent.visibility = View.VISIBLE
            binding.btnFullInformation.visibility = View.VISIBLE
            binding.imageView38.visibility = View.INVISIBLE
        }
        binding.btnIntuitionPointsBack.setOnClickListener {
            intuitionPointsViewModel.loadState(Intuition.FULL)
        }
        binding.btnIntuitionPointsBack.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.INTUITION_POINTS)
        }
        binding.btnIntuitionPointsBack.setOnClickListener {
            navigationScreenViewModel.loadState(ScreenNavigation.COMPLETED_GAME)
        }
        return binding.root
    }

}