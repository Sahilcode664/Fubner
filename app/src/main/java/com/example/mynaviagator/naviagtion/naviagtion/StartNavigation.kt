package com.example.mynaviagator.naviagtion.naviagtion

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mynaviagator.naviagtion.sceens.EachRow
import com.example.mynaviagator.naviagtion.sceens.FirstScreen
import com.example.mynaviagator.naviagtion.sceens.Photos
import com.example.mynaviagator.naviagtion.sceens.Register
import com.example.mynaviagator.naviagtion.sceens.Search
import com.example.mynaviagator.naviagtion.sceens.SecondScreen
import com.example.mynaviagator.naviagtion.sceens.ThirdScreen
import com.example.mynaviagator.naviagtion.utls.NavigationScreen

@Composable
fun StartNavigation(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination =NavigationScreen.FirstScreen.route ){
        composable(NavigationScreen.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(NavigationScreen.SecondScreen.route){
           SecondScreen()
        }
        composable(NavigationScreen.ThirdScreen.route){
            ThirdScreen(navController)
        }
        composable(NavigationScreen.Photo.route){
            Photos()
        }
        composable(NavigationScreen.Register.route){
            Register()
        }
        composable(NavigationScreen.Search.route){
            Search()
        }

    }
}


