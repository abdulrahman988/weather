package com.example.composeweather.navigation.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composeweather.navigation.screen.Screen
import com.example.composeweather.screens.home.HomeScreen
import com.example.composeweather.screens.search.SearchScreen
import com.example.composeweather.screens.splash.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route) {
        composable(route = Screen.SplashScreen.route) {
            SplashScreen()
        }
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.SearchScreen.route + "/{id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.StringType
                    defaultValue = null
                    nullable = true
                }
            )
        ){entry ->
            SearchScreen(navController = navController, id = entry.arguments?.getString("id"))
        }

    }
}
