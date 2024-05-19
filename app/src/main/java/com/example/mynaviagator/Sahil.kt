package com.example.mynaviagator

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.mynaviagator.naviagtion.naviagtion.StartNavigation
import com.example.mynaviagator.ui.theme.MyNaviagatorTheme

class Sahil : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            MyNaviagatorTheme {
                Image(painter = painterResource(id = R.drawable.wallpaper), contentDescription ="" )
                StartNavigation()
            }

        }
    }
}
