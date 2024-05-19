package com.example.mynaviagator.naviagtion.utls

sealed class NavigationScreen(val route:String)
{
    object FirstScreen: NavigationScreen(route = "firstscreen")
    object SecondScreen: NavigationScreen(route = "secondscreen")
    object ThirdScreen:NavigationScreen(route = "thirdscreen")
    object Photo:NavigationScreen(route = "photos")
    object Register:NavigationScreen(route = "register")
    object Search:NavigationScreen(route = "Search")

}
