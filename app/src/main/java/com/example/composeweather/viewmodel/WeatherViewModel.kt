package com.example.composeweather.viewmodel

import com.example.composeweather.base.BaseViewModel
import com.example.composeweather.db.model.currentWeather.response.ResponseCurrentWeather
import com.example.composeweather.db.model.forcast.responseForcast.ResponseForecast
import com.example.composeweather.repository.WeatherRepositoryImpl
import com.example.composeweather.util.AppResult
import com.example.composeweather.util.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(private val weatherRepository: WeatherRepositoryImpl) :
    BaseViewModel() {
    val responseCurrentWeather = SingleLiveEvent<ResponseCurrentWeather>()
    val responseForecast = SingleLiveEvent<ResponseForecast>()

    fun getCurrentWeather(
        lat: Double,
        lon: Double,
        units: String,
        lang: String,
    ) {
        call({
            return@call weatherRepository.getCurrentWeather(
                lat = lat, lon = lon, units = units, lang = lang
            )
        }) {
            when (it) {
                is AppResult.Success -> {
                    responseCurrentWeather.postValue(it.successData)
                }

                is AppResult.Error -> {
                    showError.postValue(it.message)
                    statusCode.postValue(it.statusCode)
                }
            }
        }
    }

    fun getForecast(
        lat: Double,
        lon: Double,
        units: String,
        lang: String,
    ) {
        call({
            return@call weatherRepository.getForecast(
                lat = lat, lon = lon, units = units, lang = lang
            )
        }) {
            when (it) {
                is AppResult.Success -> {
                    responseForecast.postValue(it.successData)
                }

                is AppResult.Error -> {
                    showError.postValue(it.message)
                    statusCode.postValue(it.statusCode)
                }
            }
        }
    }
}