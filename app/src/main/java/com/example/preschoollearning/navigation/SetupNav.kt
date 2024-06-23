package com.example.preschoollearning.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.preschoollearning.feature.start_screen_component.StartScreen

@Composable
fun NavSetup(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Screen.StartScreen.route ){
        composable(Screen.StartScreen.route){
            StartScreen( navController = navHostController)
        }
    }
    
}

