package com.example.preschoollearning.feature.start_screen_component

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.preschoollearning.repository.PreSchoolRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StartScreenViewModel @Inject constructor(private val repository: PreSchoolRepository) :
    ViewModel() {

    fun getFiles() {
        viewModelScope.launch {

        }
    }
}