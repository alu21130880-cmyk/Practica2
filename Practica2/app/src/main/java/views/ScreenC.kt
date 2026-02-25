package com.example.practica2.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ScreenC(navController: NavController) {

    Column {
        Text("Pantalla C (Confirmación)")
        Text("¡Proceso completado!")

        Button(onClick = {
            navController.navigate("screenA") {
                popUpTo(0) // limpia el back stack
            }
        }) {
            Text("Volver al inicio")
        }
    }
}