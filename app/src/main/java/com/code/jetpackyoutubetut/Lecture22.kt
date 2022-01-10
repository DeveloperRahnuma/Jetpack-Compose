package com.code.jetpackyoutubetut

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*

class Lecture22 {
    @Preview
    @Composable
    fun animatedBox(){
        var size = remember { mutableStateOf(200) }
        var anisize = animateDpAsState(
            targetValue = size.value.dp,
            animationSpec = spring(
                Spring.DampingRatioHighBouncy
            )
//            animationSpec = tween(
//                durationMillis = 1000,
//                delayMillis = 200,
//                easing = LinearOutSlowInEasing
//            )
        )
        Box(
            Modifier
                .size(size = anisize.value)
                .background(Color.Blue)) {
            Button(onClick = { size.value = size.value + 50 },
                modifier = Modifier.size(150.dp, 70.dp)) {
                Text(text = "Click Here For Increase Size")
            }
        }
    }
}