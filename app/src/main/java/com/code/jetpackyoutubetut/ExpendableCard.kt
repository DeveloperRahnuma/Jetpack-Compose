package com.code.jetpackyoutubetut

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
import androidx.compose.ui.draw.rotate

class ExpendableCard {

    @ExperimentalMaterialApi
    @Preview(showBackground = true)
    @Composable
    fun expendableCard(){
        var expendableCardclick by remember { mutableStateOf(false)}
        val rotateState by animateFloatAsState(targetValue = if(expendableCardclick) 180f else 0f)

        Column(modifier = Modifier.fillMaxWidth()) {
            Card(
                onClick = {expendableCardclick = !expendableCardclick},
                modifier = Modifier
                    .fillMaxWidth()
                    .animateContentSize(
                        animationSpec = tween(
                            durationMillis = 300,
                            easing = LinearOutSlowInEasing
                        )
                    )
            ) {
                Column() {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Click On Me",fontSize = 16.sp ,fontWeight = FontWeight.Bold ,modifier = Modifier
                            .weight(6f)
                            .padding(10.dp))
                        IconButton(onClick = { }, modifier = Modifier
                            .weight(1f)
                            .rotate(rotateState)) {
                            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "")
                        }
                    }
                    if(expendableCardclick){
                        Text(text = "We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose We Are Learning android jetpack compose")
                    }
                }
            }
        }
    }
}

