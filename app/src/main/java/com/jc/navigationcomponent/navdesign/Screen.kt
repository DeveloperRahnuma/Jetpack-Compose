package com.jc.navigationcomponent.navdesign

sealed class Screen(val routs : String){
    object FirstScreen : Screen("first_screen")
    object SecoundScreen : Screen("secound_screen")
}
