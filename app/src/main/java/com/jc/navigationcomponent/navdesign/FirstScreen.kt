package com.jc.navigationcomponent.navdesign

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController){

    var text by remember { mutableStateOf("")}

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)) {

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text(text = "Enter Your Text Here")}
                )

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                navController.navigate(Screen.SecoundScreen.routs+"/$text")
            }) {
                Text(text = "Click Here For Change Screen")
            }
        }
    }
}