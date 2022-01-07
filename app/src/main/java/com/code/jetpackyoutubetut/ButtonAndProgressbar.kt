package com.code.jetpackyoutubetut

import android.view.Surface
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.code.jetpackyoutubetut.ui.theme.Shapes
import androidx.compose.runtime.*

class ButtonAndProgressbar {
    @ExperimentalMaterialApi
    @Preview
    @Composable
    fun buttonclick(){
        var isclick by remember { mutableStateOf(false)}

        Surface(
            onClick = { isclick = !isclick },
            shape = Shapes.medium,
            border = BorderStroke(1.dp,color = Color.Black),
            color = Color.White,
            elevation = 10.dp
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(10.dp,5.dp,10.dp,5.dp)
            ){
                Icon(
                    painter = painterResource(id = R.drawable.googlebutton),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Click On Me")
                Spacer(modifier = Modifier.width(10.dp))
                if(isclick) {
                    CircularProgressIndicator(
                        modifier = Modifier.width(16.dp).height(16.dp),
                        color = MaterialTheme.colors.primary,
                        strokeWidth = 2.dp,
                    )
                }
            }
        }
    }
}