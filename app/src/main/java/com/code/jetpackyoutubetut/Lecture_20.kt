package com.code.jetpackyoutubetut

import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*

class Lecture_20 {
    @Preview
    @Composable
    fun showswitch(){
        var ischecked = remember { mutableStateOf(false)}
        Switch(checked = ischecked.value, onCheckedChange = {it ->
            ischecked.value = it
        })
    }
}