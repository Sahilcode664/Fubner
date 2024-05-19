package com.example.mynaviagator.naviagtion.sceens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynaviagator.R
import com.example.mynaviagator.naviagtion.utls.NavigationScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register() {
    val username = remember { mutableStateOf(value = "") }
    val password = remember { mutableStateOf(value = "") }
    val passwords = remember { mutableStateOf(value = "") }
    val dob = remember { mutableStateOf(value = "") }
    val phn = remember { mutableStateOf(value = "") }
    Surface() {
        run {
            Box(modifier = Modifier.fillMaxSize()) {

                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.wallpaper),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds
                )

            }

        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "New Register",
            color = Color.LightGray,
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold
        )

        OutlinedTextField(
            value = username.value,
            onValueChange = {
                username.value = it
            },
            leadingIcon = {
                androidx.compose.material3.Icon(Icons.Default.Person, contentDescription = "person")
            },
            label = {
                Text(text = "Username")
            },
            placeholder = {
                Text(text = "Enter Username")
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            value = phn.value,
            onValueChange = {
                phn.value = it
            },
            leadingIcon = {
                androidx.compose.material3.Icon(Icons.Default.Call, contentDescription = "person")
            },
            label = {
                Text(text = "Mobile No.")
            },
            placeholder = {
                Text(text = "Enter Mobile No.")
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            value = dob.value,
            onValueChange = {
                dob.value = it
            },
            leadingIcon = {
                androidx.compose.material3.Icon(Icons.Default.DateRange, contentDescription = "person")
            },
            label = {
                Text(text = "D.O.B")
            },
            placeholder = {
                Text(text = "Enter DD/MM/YYYY")
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            leadingIcon = {
                androidx.compose.material3.Icon(Icons.Default.Star, contentDescription = "person")
            },
            label = {
                Text(text = "Password")
            },
            placeholder = {
                Text(text = "Choose Password")
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            value = passwords.value,
            onValueChange = {
                passwords.value = it
            },
            leadingIcon = {
                androidx.compose.material3.Icon(Icons.Default.PlayArrow, contentDescription = "person")
            },
            label = {
                Text(text = "Password")
            },
            placeholder = {
                Text(text = "Confirm Password")
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        ) {
            Text(text = "Register")

        }
    }
}