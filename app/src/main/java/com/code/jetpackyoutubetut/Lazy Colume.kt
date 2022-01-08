package com.code.jetpackyoutubetut

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class LazyColume {

    @Preview
    @Composable
    fun Lazyy(){
        var scst = rememberScrollState()
        var listofstr = listOf<String>("A","b","c","d","e","f","A","b","c","d","e","f","A","b","c","d","e","f","A","b","c","d","e","f","A","b","c","d","e","f","A","b","c","d","e","f")

        Row {
            Column(modifier = Modifier.verticalScroll(scst)) {
                for(i in 1..100){
                    Text(text = "item $i", color = Color.Black, fontSize = 18.sp)
                }
            }

            LazyColumn(){
                itemsIndexed(listofstr){index, string ->
                    Text(text = "item $string on $index", color = Color.Black, fontSize = 18.sp)
                }
            }
        }

    }
}