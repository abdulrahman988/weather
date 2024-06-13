package com.example.composeweather.repository

import com.example.composeweather.network.WeatherApi
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val api: WeatherApi) {

    suspend fun getWeather(){
        api.getWeatherApi("hggh")
    }

}