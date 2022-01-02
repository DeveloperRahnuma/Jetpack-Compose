package com.code.jetpackyoutubetut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.code.jetpackyoutubetut.ui.theme.JetpackYoutubeTutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackYoutubeTutTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    //for styling text first way
   Text(text = "Hello $name!", color = Color.Black, fontSize = 20.sp)

    //secound way
    Text(text = "Hello user", style = TextStyle(
        color = Color.Blue,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    ))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackYoutubeTutTheme {
        Greeting("Android")
    }
}