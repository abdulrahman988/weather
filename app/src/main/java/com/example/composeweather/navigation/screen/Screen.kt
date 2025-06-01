package com.example.composeweather.navigation.screen

import com.example.composeweather.util.Screens

sealed class Screen(val route: String) {
    object SplashScreen : Screen(Screens.SPLASH_SCREEN.name)
    object HomeScreen : Screen(Screens.HOME_SCREEN.name)
    object SearchScreen : Screen(Screens.SEARCH_SCREEN.name)
}