package com.example.composeweather.repository

import com.example.composeweather.db.model.currentWeather.response.ResponseCurrentWeather
import com.example.composeweather.db.model.forcast.responseForcast.ResponseForecast
import com.example.composeweather.network.WeatherApi
import com.example.composeweather.util.AppResult
import com.example.composeweather.util.Utils.handleApiError
import com.example.composeweather.util.Utils.handleSuccess
import retrofit2.Response
import retrofit2.http.Query
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(private val api: WeatherApi): WeatherRepository {

    override suspend fun getCurrentWeather(
        lat: Double,
        lon: Double,
        units: String,
        lang: String,
    ): AppResult<ResponseCurrentWeather>{
        return try {
            val response = api.getCurrentWeather(
                lat = lat,
                lon = lon,
                units = units,
                lang = lang
            )
            if (response.isSuccessful) {
                handleSuccess(response)
            } else {
                handleApiError(response)
            }
        } catch (e: Exception) {
            AppResult.Error(e)
        }
    }

    override suspend fun getForecast(
        lat: Double,
        lon: Double,
        units: String,
        lang: String,
    ): AppResult<ResponseForecast>{
        return try {
            val response = api.getForecast(
                lat = lat,
                lon = lon,
                units = units,
                lang = lang
            )
            if (response.isSuccessful) {
                handleSuccess(response)
            } else {
                handleApiError(response)
            }
        } catch (e: Exception) {
            AppResult.Error(e)
        }
    }
}