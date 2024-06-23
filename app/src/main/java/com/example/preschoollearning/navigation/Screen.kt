package com.example.preschoollearning.navigation

sealed class Screen (val route : String){
    object StartScreen : Screen("StartScreen")
}