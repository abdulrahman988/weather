package com.example.composeweather.network

import com.example.composeweather.db.model.currentWeather.response.ResponseCurrentWeather
import com.example.composeweather.db.model.forcast.responseForcast.ResponseForecast
import com.example.composeweather.util.APIS
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherApi {

    @GET(APIS.WEATHER)
    suspend fun getCurrentWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String,
        @Query("lang") lang: String,
    ): Response<ResponseCurrentWeather>

    @GET(APIS.FORECAST)
    suspend fun getForecast(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String,
        @Query("lang") lang: String,
    ): Response<ResponseForecast>

}