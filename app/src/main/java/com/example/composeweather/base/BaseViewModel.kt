package com.example.composeweather.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeweather.util.AppResult
import com.example.composeweather.util.SingleLiveEvent
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

open class BaseViewModel() : ViewModel() {
    val statusCode = SingleLiveEvent<Int?>()
    val showError = SingleLiveEvent<String?>()
    private var job: Job? = null

    fun <T> call(
        serverCall: suspend () -> AppResult<T>,
        onResponse: (AppResult<T>) -> Unit,
    ) {
        job = viewModelScope.launch {
            when (val result = serverCall()) {
                is AppResult.Success -> {
                    onResponse(result)
                }

                is AppResult.Error -> {
                    showError.value = result.exception.message
                    statusCode.value = result.statusCode
                }

            }
        }
    }


    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }
}