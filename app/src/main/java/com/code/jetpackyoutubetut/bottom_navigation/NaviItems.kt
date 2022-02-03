package com.code.jetpackyoutubetut.bottom_navigation

import com.code.jetpackyoutubetut.R

sealed class NaviItems(var title : String, var icon : Int) {
    object home : NaviItems("Home", R.drawable.home)
    object setting : NaviItems("Settings", R.drawable.settings)
    object profile : NaviItems("Profile", R.drawable.ic_profile)
}