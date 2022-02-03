package com.code.jetpackyoutubetut

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview()
fun circularImageView(){
    Box(modifier = Modifier.border(10.dp, Color.Green).clip(CircleShape)) {
        Image(
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape),
            painter = painterResource(id = R.drawable.bg_3),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
    }
}