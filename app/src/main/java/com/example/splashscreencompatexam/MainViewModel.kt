package com.example.splashscreencompatexam

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private var isLoading: Boolean = true

    fun isInitializationComplete(): Boolean {
        longTime()
        return isLoading
    }

    private fun longTime() {
        for (i in 1..100_000_000) {
            // 오래 걸리는 작업
            println()
        }
        isLoading = false
    }
}