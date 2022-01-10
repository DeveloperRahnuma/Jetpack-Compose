package com.code.jetpackyoutubetut

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*

class Lecture_19 {
    @Preview
    @Composable
    fun designtext(){
        var size = 5
        var text by remember { mutableStateOf("type")}
        TextField(value = text, onValueChange ={it->
            if(it.length <= size){
                text = it
            }
        } )
    }
}