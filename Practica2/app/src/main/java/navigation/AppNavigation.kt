package com.example.practica2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController
import com.example.practica2.views.ScreenA
import com.example.practica2.views.ScreenB
import com.example.practica2.views.ScreenC

@Composable
fun AppNavigation() {

    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "screenA"
    ) {

        composable("screenA") { ScreenA(navController) }

        composable("screenB/{name}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")
            ScreenB(navController, name)
        }

        composable("screenC") { ScreenC(navController) }
    }
}