package com.example.composeweather.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeweather.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewmodel @Inject constructor(
    private val weatherRepository : WeatherRepository
) : ViewModel() {
    fun getWeather(){
        viewModelScope.launch {
            weatherRepository.getWeather()
        }
    }
}