package com.code.jetpackyoutubetut

sealed class Screen(val routes : String){
    object MainScreen : Screen("mainscreen")
    object SecoundScreen : Screen("secound_screen")
}
