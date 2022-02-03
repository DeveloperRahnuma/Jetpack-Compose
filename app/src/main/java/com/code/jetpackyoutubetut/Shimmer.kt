package com.code.jetpackyoutubetut

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun animatedShimmer(){
    val shimmercolor = listOf(
        Color.LightGray.copy(0.6f),
        Color.LightGray.copy(0.2f),
        Color.LightGray.copy(0.6f)
    )

    val infinateTrans = rememberInfiniteTransition()
    val animatedtime =infinateTrans.animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(
            tween(
                durationMillis = 1000,
                easing = FastOutSlowInEasing
            )
        )
    )

    val brush = Brush.linearGradient(
        colors = shimmercolor,
        start = Offset.Zero,
        end = Offset(x = animatedtime.value, y = animatedtime.value)
    )

    shimmerDesign(brush)
}

@Composable
fun shimmerDesign(brush: Brush){
    Row(modifier = Modifier.fillMaxWidth().padding(10.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Spacer(modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .background(brush))
        Spacer(modifier = Modifier.width(10.dp))

        Column() {
            Spacer(modifier = Modifier
                .height(20.dp).clip(CircleShape)
                .fillMaxWidth(0.7f)
                .background(brush))

            Spacer(modifier = Modifier.height(5.dp))

            Spacer(modifier = Modifier
                .height(20.dp)
                .clip(CircleShape)
                .fillMaxWidth(0.9f)
                .background(brush))
         }
    }
}


@Composable
@Preview
fun shimmerPreview(){

    shimmerDesign(Brush.linearGradient(
        listOf(
            Color.LightGray.copy(0.6f),
            Color.LightGray.copy(0.2f),
            Color.LightGray.copy(0.6f)
        )
    ))
}

