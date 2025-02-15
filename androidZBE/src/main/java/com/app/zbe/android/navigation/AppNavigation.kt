package com.app.zbe.android.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.zbe.android.mapBox.MapScreen
import kotlinx.serialization.Serializable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    Scaffold(
     //   bottomBar = { BottomNavigationBar (navController)}

    )

   {

        NavHost(
            navController = navController,
            startDestination = Map
        ){
            composable<Map> {
                MapScreen()
            }

        }
    }
}

@Serializable
object Map

