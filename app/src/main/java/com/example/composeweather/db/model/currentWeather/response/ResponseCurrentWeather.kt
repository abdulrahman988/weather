package com.example.composeweather.db.model.currentWeather.response

import com.example.composeweather.db.model.clouds.Clouds
import com.example.composeweather.db.model.coordination.Coordination
import com.example.composeweather.db.model.main.Main
import com.example.composeweather.db.model.sys.Sys
import com.example.composeweather.db.model.weather.Weather
import com.example.composeweather.db.model.wind.Wind
import com.google.gson.annotations.SerializedName

data class ResponseCurrentWeather(
    @SerializedName("base")
    val base: String,
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("cod")
    val cod: Int,
    @SerializedName("coord")
    val coordination: Coordination,
    @SerializedName("dt")
    val dt: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("main")
    val main: Main,
    @SerializedName("name")
    val name: String,
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("timezone")
    val timezone: Int,
    @SerializedName("visibility")
    val visibility: Int,
    @SerializedName("weather")
    val weather: List<Weather>,
    @SerializedName("wind")
    val wind: Wind
)