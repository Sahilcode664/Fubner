package com.example.mynaviagator.naviagtion.sceens

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.NavHostController
import com.example.mynaviagator.MainActivity
import com.example.mynaviagator.R
import com.example.mynaviagator.naviagtion.utls.NavigationScreen
import androidx.compose.foundation.Image as Image1
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ThirdScreen(navHostController: NavHostController) {
    var count: Int = 0
    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {

                TopAppBar(colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Black),
                    title = {
                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(65.dp)
                                .size(150.dp)
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            androidx.compose.foundation.Image(
                                painter = painterResource(id = R.drawable.ph1),
                                contentDescription = "image",
                                modifier = Modifier
                                    .padding(3.dp)
                                    .size(400.dp)
                                    .clip(CircleShape)
                                    .border(1.5f.dp, Color(0xFF881346), RoundedCornerShape(50))
                                    .clickable { navHostController.navigate(NavigationScreen.Photo.route) }

                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = {navHostController.navigate(NavigationScreen.SecondScreen.route)}) {
                            Image1(
                                painter = painterResource(id = R.drawable.sharecolour),
                                contentDescription = "",
                                modifier = Modifier.size(30.dp)

                            )
                        }
                    }
                )
            },
            bottomBar = {
                Row() {


                    Image1(
                        painter = painterResource(id = R.drawable.icons8_home_100),
                        contentDescription = "", modifier = Modifier
                            .padding(horizontal = 25.dp, vertical = 10.dp)
                            .size(25.dp)
                            .clickable { navHostController.navigate(NavigationScreen.ThirdScreen.route) }
                    )
                    Image1(
                        painter = painterResource(id = R.drawable.icons8_search_48),
                        contentDescription = "", modifier = Modifier
                            .padding(horizontal = 25.dp, vertical = 10.dp)
                            .size(30.dp)
                            .clickable { navHostController.navigate(NavigationScreen.Search.route) }
                    )
                    Image1(
                        painter = painterResource(id = R.drawable.icons8_plus_100),
                        contentDescription = "", modifier = Modifier
                            .padding(horizontal = 25.dp, vertical = 10.dp)
                            .size(30.dp)
                            .clickable { }
                    )
                    Image1(
                        painter = painterResource(id = R.drawable.reels_13411),
                        contentDescription = "", modifier = Modifier
                            .padding(horizontal = 25.dp, vertical = 10.dp)
                            .size(30.dp)
                            .clickable { }
                    )
                    Image1(
                        painter = painterResource(id = R.drawable.icons8_notification_100),
                        contentDescription = "", modifier = Modifier
                            .padding(horizontal = 25.dp, vertical = 10.dp)
                            .size(30.dp)
                            .clickable { }
                    )
                }
            }
        )
        {
            Box(modifier = Modifier.fillMaxSize()) {
                Color(0xFF0BC5AB);

            }

        }
    }
    LazyColumn(modifier = Modifier.padding(horizontal = 5.dp, vertical = 65.dp))
    {
        items(1) {
            LazyRow(modifier = Modifier.padding(horizontal = 5.dp, vertical = 5.dp))
            {
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
                items(1) {
                    Card(
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .size(70.dp)
                            .clip(CircleShape)
                            .border(3.0f.dp, Color(0xFF0E79CE), RoundedCornerShape(50))
                            .clickable { navHostController.navigate(NavigationScreen.Photo.route) },
                        shape = RoundedCornerShape(CornerSize(10.dp)),
                    ) {
                        Image1(
                            painter = painterResource(id = R.drawable.ph1),
                            contentDescription = "",
                            modifier = Modifier.padding(vertical = 6.dp)
                        )
                    }
                }
            }

        }

        items(1) {
            EachRows("Sahil Mishra", R.drawable.img_20230423_173931_864, R.drawable.offline)

        }
        items(1) {
            EachRows("Sahil Mishra", R.drawable.ph10, R.drawable.online)

        }
        items(1) {
            EachRows("Sahil Mishra", R.drawable.ph2, R.drawable.offline)

        }
        items(1) {
            EachRows("Sahil Mishra", R.drawable.ph3, R.drawable.online)

        }
        items(1) {
            EachRows("Sahil Mishra", R.drawable.ph4, R.drawable.online)

        }
        items(1) {
            EachRows("Sahil Mishra", R.drawable.ph5, R.drawable.offline)

        }
        items(1) {
            EachRows("Sahil Mishra", R.drawable.ph6, R.drawable.online)

        }
        items(1) {
            EachRows("Sahil Mishra", R.drawable.ph7, R.drawable.online)

        }
        items(1) {
            EachRows("Sahil Mishra", R.drawable.ph8, R.drawable.online)

        }
        items(1) {
            EachRows("Sahil Mishra", R.drawable.ph9, R.drawable.online)

        }


    }
}
@Composable
fun EachRows(user:String, image: Int, status:Int) {
    var count by remember { mutableStateOf(0) }
    val img = when (count){
        0 -> R.drawable.icons8_heart_100
        2-> R.drawable.redlike_33472
        else -> R.drawable.icons8_heart_100
    }
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(CornerSize(10.dp)),
        )
        { Surface(color =  Color(0xFF0F0F0F)) {
            Column(modifier = Modifier.padding(2.dp)) {
                Row() {
                    Image1(
                        painter = painterResource(id = R.drawable.ph5), contentDescription = "image",
                        modifier = Modifier
                            .padding(8.dp)
                            .size(35.dp)
                            .clip(CircleShape)
                            .border(1.5f.dp, Color((0xFF991B3F)), RoundedCornerShape(50))
                            .clickable {}

                    )
                    Text(text = user, color = Color.LightGray, modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp))
                    Image1(
                        painter = painterResource(id = R.drawable.verified),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(8.dp)
                            .size(20.dp)
                            .clip(CircleShape)
                    )
                }
                Box {
                    Image1(
                        painter = painterResource(id = image), contentDescription = "image",
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                            .size(200.dp)
                            .clickable {}
                    )
                    Button(
                        onClick = {
                            when (count) {
                                1 -> count = 2
                                2 -> count = 3
                                else -> count = 1
                            }
                        }, modifier = Modifier
                            .size(250.dp)
                            .align(
                                alignment = Alignment.Center
                            ), colors = ButtonDefaults.buttonColors(Color.Transparent)
                    ) {}

                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Box {
                        Image1(
                            painter = painterResource(id = img),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(vertical = 8.dp, horizontal = 10.dp)
                                .size(30.dp)
                                .clickable {}
                        )
                        Button(
                            onClick = {
                                when (count) {
                                    1 -> count = 2
                                    else -> count = 1
                                }
                            },
                            modifier = Modifier
                                .size(40.dp),
                            colors = ButtonDefaults.buttonColors(Color.Transparent)
                        ) {}
                    }
                    Image1(
                        painter = painterResource(id = R.drawable.icons8_comment_100),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(vertical = 10.dp, horizontal = 20.dp)
                            .size(27.dp)
                            .clickable {}
                    )
                    Image1(
                        painter = painterResource(id = R.drawable.sare),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(10.dp)
                            .size(27.dp)
                            .clickable {}
                    )
                    Image1(
                        painter = painterResource(id = R.drawable.save_),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(horizontal = 90.dp, vertical = 10.dp)

                            .size(27.dp)
                            .clickable {}
                    )
                }
            }
        }
        }
}

fun Image1(painter: Int, contentDescription: String) {
    TODO("Not yet implemented")
}
fun Image(painter: Int) {
    TODO("Not yet implemented")
}
