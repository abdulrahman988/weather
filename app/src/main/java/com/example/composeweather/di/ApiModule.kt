package com.example.composeweather.di

import com.example.composeweather.network.WeatherApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): WeatherApi {
        return retrofit.create(WeatherApi::class.java)
    }

}