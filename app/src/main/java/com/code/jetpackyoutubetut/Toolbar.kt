package com.code.jetpackyoutubetut.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ToolBarDesign(){
   MaterialTheme() {
       TopAppBar(
           title = { Text(text = "Toolbar Design", fontSize = 16.sp)},
           modifier = Modifier.fillMaxWidth(),
           backgroundColor = Color.Red,
           navigationIcon = { IconButton(onClick = { }) {
               Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "")
           }},
           actions = {
               IconButton(onClick = { }) {
                   Icon(imageVector = Icons.Default.Search, contentDescription = "" )
               }
               IconButton(onClick = { }) {
                   Icon(imageVector = Icons.Default.MoreVert, contentDescription = "" )
               }
           }
       )
   }
}