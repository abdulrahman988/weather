package com.example.composeweather.network

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherApi {

    @GET("location/search/{name}")
    suspend fun getWeatherApi(@Path("name") name: String)

}