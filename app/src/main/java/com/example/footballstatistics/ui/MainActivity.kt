package com.example.footballstatistics.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.footballstatistics.R
import com.example.footballstatistics.databinding.ActivityMainBinding
import com.example.footballstatistics.ui.completed_game.CompletedGameFragment
import com.example.footballstatistics.ui.full_information.FullInformationFragment
import com.example.footballstatistics.ui.game.GameFragment
import com.example.footballstatistics.ui.intuition_points.IntuitionPointsFragment
import com.example.footballstatistics.ui.league.LeagueFragment
import com.example.footballstatistics.ui.onboarding.OnboardingFragment
import com.example.footballstatistics.ui.point_history.PointHistoryFragment
import com.example.footballstatistics.ui.rule.RuleFragment
import com.example.footballstatistics.ui.start.StartFragment
import com.example.footballstatistics.util.ScreenNavigation
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val navigationScreenViewModel: NavigationScreenViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        lifecycleScope.launch {
            navigationScreenViewModel.stateScreenNavigation.collect {
                when (it) {
                    ScreenNavigation.START -> replaceFragment(StartFragment())
                    ScreenNavigation.COMPLETED_GAME -> replaceFragment(CompletedGameFragment())
                    ScreenNavigation.GAME -> replaceFragment(GameFragment())
                    ScreenNavigation.FULL_INFORMATION -> replaceFragment(FullInformationFragment())
                    ScreenNavigation.LEAGUE -> replaceFragment(LeagueFragment())
                    ScreenNavigation.INTUITION_POINTS -> replaceFragment(IntuitionPointsFragment())
                    ScreenNavigation.RULE -> replaceFragment(RuleFragment())
                    ScreenNavigation.POINT_HISTORY -> replaceFragment(PointHistoryFragment())
                    ScreenNavigation.ONBOARDING -> replaceFragment(OnboardingFragment())
                }
            }
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }
}