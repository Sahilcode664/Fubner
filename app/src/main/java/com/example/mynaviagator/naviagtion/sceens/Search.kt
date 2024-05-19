package com.example.mynaviagator.naviagtion.sceens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.unit.dp
import com.example.mynaviagator.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(){
    val username = remember { mutableStateOf(value = "") }
    Surface(modifier = Modifier.fillMaxWidth()) {
        Box(modifier = Modifier.fillMaxSize()) {

            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.bg2),
                contentDescription = "",
                contentScale = ContentScale.FillBounds
            )

        }
        OutlinedTextField(
            value = username.value,
            onValueChange = {
                username.value = it
            },
            leadingIcon = {
                androidx.compose.material3.Icon(Icons.Default.Search, contentDescription = "search")
            },
            label = {
                Text(text = "Search")
            },
            placeholder = {
                Text(text = "Enter Here")
            },
            modifier = Modifier
                .fillMaxWidth().padding(vertical = 10.dp, horizontal = 10.dp)

        )

    }
}