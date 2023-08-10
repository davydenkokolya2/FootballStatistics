package com.example.footballstatistics.ui.intuition_points

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.footballstatistics.util.Intuition
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IntuitionPointsViewModel @Inject constructor() : ViewModel() {
    private val _stateIntuition = MutableStateFlow(Intuition.EMPTY)
    val stateIntuition: StateFlow<Intuition> = _stateIntuition
    fun loadState(intuition: Intuition) {
        viewModelScope.launch(Dispatchers.IO) {
            _stateIntuition.emit(intuition)
        }
    }
}