package com.example.composeweather.db.model.forcast.responseForcast

import com.example.composeweather.db.model.clouds.Clouds
import com.example.composeweather.db.model.coordination.Coordination
import com.example.composeweather.db.model.main.Main
import com.example.composeweather.db.model.sys.Sys
import com.example.composeweather.db.model.weather.Weather
import com.example.composeweather.db.model.wind.Wind

data class ResponseForecast(

    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coordination,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)