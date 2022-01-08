package com.code.jetpackyoutubetut

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LazyyRow {
    @Composable
    fun lazyyy(){

        LazyRow(){
            items(100){
                Text(text = "item $it", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(20.dp))
            }
        }
    }
}