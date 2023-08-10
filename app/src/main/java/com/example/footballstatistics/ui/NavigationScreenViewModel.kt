package com.example.footballstatistics.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.footballstatistics.util.ScreenNavigation
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NavigationScreenViewModel @Inject constructor(): ViewModel() {
    private val _stateScreenNavigation = MutableStateFlow<ScreenNavigation>(ScreenNavigation.ONBOARDING)
    val stateScreenNavigation: StateFlow<ScreenNavigation> = _stateScreenNavigation
    fun loadState(screenNavigation: ScreenNavigation) {
        viewModelScope.launch(Dispatchers.IO) {
            _stateScreenNavigation.emit(screenNavigation)
        }
    }
}