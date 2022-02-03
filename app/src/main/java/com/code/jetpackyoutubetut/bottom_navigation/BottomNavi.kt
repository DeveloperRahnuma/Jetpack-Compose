package com.code.jetpackyoutubetut.bottom_navigation

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.code.jetpackyoutubetut.R



@RequiresApi(Build.VERSION_CODES.N)
@SuppressLint("UnrememberedMutableState")
@Composable
@Preview()
fun BottomNaviTwo(){
    var list = mutableStateListOf(
        NaviItems.home,
        NaviItems.setting,
        NaviItems.profile,
        NaviItems.home,
        NaviItems.setting,
        NaviItems.profile
    )

    BottomNavigation {
        list.forEach { item ->
//            BottomNavigationItem(
//                label = { Text(text = item.title)},
//                icon = { androidx.compose.material.Icon(painter = painterResource(id = item.icon), contentDescription = "")},
//                selected = false,
//                onClick = {
//                    when(item.title){
//                        "Home" -> ""
//                        "Profile" -> ""
//                        "setting" -> ""
//                    }
//                }
//            )
        }
    }

}



@Composable
@Preview
fun BottomNaviDeisgn(){
   BottomNavigation() {
       BottomNavigationItem(
           selected = false,
           onClick = {  },
           icon = { androidx.compose.material.Icon(painter = painterResource(id = R.drawable.home), contentDescription = "")},
           label = { Text(text = "Home Screen")}
       )
       BottomNavigationItem(
           selected = false,
           onClick = {  },
           icon = { androidx.compose.material.Icon(painter = painterResource(id = R.drawable.home), contentDescription = "")},
           label = { Text(text = "Home Screen")}
       )
       BottomNavigationItem(
           selected = false,
           onClick = {  },
           icon = { androidx.compose.material.Icon(painter = painterResource(id = R.drawable.home), contentDescription = "")},
           label = { Text(text = "Home Screen")}
       )
       BottomNavigationItem(
           selected = false,
           onClick = {  },
           icon = { androidx.compose.material.Icon(painter = painterResource(id = R.drawable.home), contentDescription = "")},
           label = { Text(text = "Home Screen")}
       )
   }
}











