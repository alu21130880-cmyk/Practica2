package com.example.practica2.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ScreenB(navController: NavController, name: String?) {

    Column {
        Text("Pantalla B (Detalle)")
        Text("Nombre recibido: $name")

        Button(onClick = {
            navController.navigate("screenC")
        }) {
            Text("Ir a Pantalla C")
        }
    }
}