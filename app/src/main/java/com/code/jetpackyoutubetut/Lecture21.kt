package com.code.jetpackyoutubetut

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Lecture21 {
    @ExperimentalFoundationApi
    @Preview
    @Composable
    fun HEADERsticky(){

        var l = listOf<String>("A","B","C","D","E","F","G","H","I","J","K")
        
        LazyColumn(){
            l.forEach{

                stickyHeader {
                    Card(modifier = Modifier.fillMaxWidth(),backgroundColor = Color.Blue, elevation = 10.dp) {
                        Text(text = "Item $it", Modifier.padding(vertical = 20.dp))
                    }
                }
                itemsIndexed(items = l){index, item ->
                    Card(modifier = Modifier.fillMaxWidth(),backgroundColor = Color.White,elevation = 10.dp) {
                        Text(text = "Item ${l.get(index)}", Modifier.padding(vertical = 20.dp))
                    }
                }
            }
        }

    }
}