package com.example.jetfoodnusantara.ui.navigation

sealed class Screen(val route: String){
    object Home: Screen("home")
    object Profile: Screen("profile")
    object DetailFood: Screen("home/{foodId}"){
        fun createRoute(foodId: Long) = "home/$foodId"
    }
}
