package com.example.composeweather.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.example.composeweather.R

@Composable
fun AppBackground(){
    Box(
        modifier = Modifier
            .background(color = colorResource(id = R.color.blue))
            .fillMaxSize()
            .alpha(.2f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "image",
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.FillBounds
        )
    }
}