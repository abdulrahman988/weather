package com.example.composeweather.repository

import com.example.composeweather.db.model.currentWeather.response.ResponseCurrentWeather
import com.example.composeweather.db.model.forcast.responseForcast.ResponseForecast
import com.example.composeweather.util.AppResult
import retrofit2.Response

interface WeatherRepository {
    suspend fun getCurrentWeather(
        lat: Double,
        lon: Double,
        units: String,
        lang: String,
    ): AppResult<ResponseCurrentWeather>

    suspend fun getForecast(
        lat: Double,
        lon: Double,
        units: String,
        lang: String,
    ): AppResult<ResponseForecast>
}