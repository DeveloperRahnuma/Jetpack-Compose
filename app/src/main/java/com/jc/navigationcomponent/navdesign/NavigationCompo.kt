package com.jc.navigationcomponent.navdesign

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
@Preview
fun navigationComponent(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.FirstScreen.routs){
        composable(Screen.FirstScreen.routs){
            FirstScreen(navController)
        }
        composable(Screen.SecoundScreen.routs){
            SecoundScreen()
        }
    }
}