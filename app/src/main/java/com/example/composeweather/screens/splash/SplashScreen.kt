package com.example.composeweather.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeweather.R
import com.example.composeweather.composables.AppBackground

@Composable
fun SplashScreen() {
    AppBackground()
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(top = 150.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_sunny_24),
                contentDescription = "image",
                modifier = Modifier.size(250.dp),
            )
            Text(
                text = "Find weather wherever you are",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier.padding(top = 30.dp)
            )
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun ShowSplash() {
    SplashScreen()
}