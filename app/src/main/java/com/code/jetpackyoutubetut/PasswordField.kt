package com.code.jetpackyoutubetut

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*

class PasswordField {
    @Preview(showBackground = true)
    @Composable
    fun PasswordField(){
        var text by remember { mutableStateOf("") }
        var isclick by remember { mutableStateOf(false)}

        var icon = if(isclick) painterResource(id = R.drawable.visiblity) else painterResource(id = R.drawable.visibility_off)

        Box(modifier = Modifier
            .fillMaxWidth()
           ) {
            OutlinedTextField(
                value = text,
                placeholder = { Text(text = "Password")},
                onValueChange = { it -> text =  it},
                trailingIcon = {
                    IconButton(onClick = { isclick = !isclick }) {
                        Icon(painter = icon, contentDescription = "")
                    }
                },
            )
        }
    }
}