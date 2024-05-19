@file:Suppress("UNUSED_CHANGED_VALUE")

package com.example.mynaviagator.naviagtion.sceens

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mynaviagator.R
import com.example.mynaviagator.naviagtion.utls.NavigationScreen
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FirstScreen(navHostController: NavHostController){
    var count : Int=0
    val username = remember { mutableStateOf(value = "") }
    val password = remember { mutableStateOf(value = "") }
    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {

                TopAppBar(colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(
                    0xFF5C3C5B
                )
                ),
                    title = {
                       Text( text = "Fubner",
                           color = Color(0xFF03FFB8),
                           fontSize = 32.sp,
                           fontFamily = FontFamily.Cursive,
                           fontWeight = FontWeight.Bold,
                           modifier = Modifier.padding(vertical = 120.dp, horizontal = 100.dp))

                            },
                    navigationIcon = {
                        IconButton(onClick = {navHostController.navigate((NavigationScreen.Photo.route))}){
                            Image(
                                painter = painterResource(id = R.drawable.ph1), contentDescription = "image",
                                modifier = Modifier
                                    .padding(3.dp)
                                    .size(400.dp)
                                    .clip(CircleShape)
                                    .border(1.5f.dp, Color.Magenta, RoundedCornerShape(50))
                                    .clickable { navHostController.navigate(NavigationScreen.Photo.route) }

                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = {navHostController.navigate(NavigationScreen.Search.route)}) {
                            Icon(Icons.Filled.Search,
                                contentDescription = "search",
                                modifier = Modifier
                            )
                        }
                    }
                )
            },
        )
        {
            Box(modifier = Modifier.fillMaxSize()) {

                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.bg1),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
fun Icon(image: Unit) {}
Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 220.dp),
    ) {
    Text(
        text = "Login Credentials",
        color = Color(0xFF571A1A),
        fontSize = 40.sp,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(vertical = 50.dp, horizontal = 40.dp)
    )
    OutlinedTextField(
        value = username.value,
        onValueChange = {
            username.value = it
        },
        shape = RoundedCornerShape(40.dp),
        leadingIcon = {
            Icon(Icons.Default.Person, contentDescription = "person")
        },
        label = {
            Text(text = "Username",
                color = Color(0xFF9EC0BC)
                )
        },
        placeholder = {
            Text(text = "Enter Username")
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    OutlinedTextField(
        value = password.value,
        onValueChange = {
            password.value = it
        },
        shape = RoundedCornerShape(40.dp),
        leadingIcon = {
            Image(painter = painterResource(id = R.drawable.icons8_password_60), contentDescription = "")
        },
        label = {
            Text(text = "Password",
                color = Color(0xFF9EC0BC)
            )
        },
        placeholder = {
            Text(text = "Enter Password")
        },
        modifier = Modifier
            .fillMaxWidth()
    )
    OutlinedButton(
        onClick = {
            if (username.value == "Sahil88" && password.value == "Sahil88") {
                    navHostController.navigate(NavigationScreen.ThirdScreen.route)
            } else {
                count++
                if (count == 3) {
                    navHostController.navigate(NavigationScreen.ThirdScreen.route)
                }
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
    ) {
        Text(text = "Login")

    }
    Row(modifier = Modifier.padding(10.dp)) {
        Text(
            text = "Register",
            color = Color.White,
            fontSize = 15.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clickable{navHostController.navigate(NavigationScreen.Register.route)}
        

        )
        Spacer(modifier = Modifier.width(90.dp))
        Text(
            text = "Forget Password ?",
            color = Color.White,
            fontSize = 15.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {  }
        )

    }

}
}

fun Image(painter: Int, contentDescription: String) {


}

fun Icon() {
}

private fun logged(username: String ,password: String){


}

