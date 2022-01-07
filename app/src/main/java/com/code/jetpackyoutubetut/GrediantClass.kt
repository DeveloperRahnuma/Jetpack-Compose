package com.code.jetpackyoutubetut

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class GrediantClass {
    @Preview(showBackground = true)
    @Composable
    fun Grediant(){
       var gr = Brush.radialGradient(
            colors = listOf(
                Color.Red,
                Color.Blue,
                Color.Green,
                Color.Black
            ),)
        
        Box(modifier = Modifier.size(400.dp,400.dp).background(gr)) {
            
        }
    }
}