package com.code.jetpackyoutubetut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.code.jetpackyoutubetut.ui.theme.JetpackYoutubeTutTheme
import java.util.*

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackYoutubeTutTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    val expendableCard = ExpendableCard()
//                    expendableCard.expendableCard()
//                    Greeting("Android")

                    var pass = Lecture22()
                    pass.animatedBox()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

//    Column(verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier
//        .size(200.dp, 400.dp)
//        .background(Color.Green)) {
//        Box(modifier = Modifier
//            .size(100.dp, 100.dp)
//            .background(Color.Black))
//        Box(modifier = Modifier
//            .size(100.dp, 100.dp)
//            .background(Color.Red))
//        Box(modifier = Modifier
//            .size(100.dp, 100.dp)
//            .background(Color.Blue))
//
//    }

//    Card(modifier = Modifier.size(400.dp, 400.dp),
//        shape = RoundedCornerShape(60.dp),
//        backgroundColor = Color.Red,
//        contentColor = Color.Black
//    ) {
//        Text(text = "Demo App", style = TextStyle(
//            fontSize = 50.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.White
//        ))
//    }

    


}

@Preview(showBackground = true)
@Composable
fun Defult_preview_three(){
    OutlinedTextField(
        value = "Type Here",
        onValueChange = {},
        enabled = true,
        label = { Text(text = "Testing")},
        leadingIcon = { IconButton(onClick = { }) {
            Icon(imageVector = Icons.Filled.Email, contentDescription = "Image Email")
        }},
        trailingIcon = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Filled.ExitToApp, contentDescription = "Image Email")
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(onGo = {

        })
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview_one() {
    JetpackYoutubeTutTheme {
        TextField(
            value = "Type Here",
            onValueChange = {},
            enabled = true,
            label = { Text(text = "Testing")},
            leadingIcon = { IconButton(onClick = { }) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Image Email")
            }},
            trailingIcon = {
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Filled.ExitToApp, contentDescription = "Image Email")
                }
            },
            keyboardOptions = KeyboardOptions(
              keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(onGo = {

            })
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Defult_preview_two(){
    TextField(
        value = "Type Here",
        onValueChange = {},
        enabled = true,
        label = { Text(text = "Testing")},
        leadingIcon = { IconButton(onClick = { }) {
            Icons.Filled.Email
        }}
        )
}
