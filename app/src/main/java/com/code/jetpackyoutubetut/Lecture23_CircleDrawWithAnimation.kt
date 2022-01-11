package com.code.jetpackyoutubetut

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Lecture23_CircleDrawWithAnimation {
    @Preview
    @Composable
    fun CircularProcess(){
        var isplay by remember { mutableStateOf(false)}

        var animation = animateFloatAsState(
            targetValue = if(isplay) 360f else 0f,
            animationSpec = tween(
                durationMillis = 5000,
                delayMillis = 1000
            )
        )

        LaunchedEffect(key1 = true, ){
            isplay = true
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(modifier = Modifier.size(300.dp), contentAlignment = Alignment.Center){
                Canvas(modifier = Modifier
                    .size(270.dp)
                    .padding(20.dp),){
                    drawArc(
                        color = Color.Green,
                        startAngle = -90f,
                        sweepAngle = animation.value,
                        useCenter = false,
//                        style = Stroke(100f,cap = StrokeCap.Round)
                    )
                }

                Text(text = animation.value.toString(), style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                ))
            }
        }

    }
}