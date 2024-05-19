package com.example.mynaviagator.naviagtion.sceens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import com.example.mynaviagator.R
import com.example.mynaviagator.naviagtion.utls.NavigationScreen



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(){
Surface(modifier = Modifier.fillMaxSize()) {
    Box(modifier = Modifier.fillMaxSize()){
    Image(painter = R.drawable.bg2, contentDescription ="" )}


    LazyColumn(modifier = Modifier.padding(horizontal = 5.dp))
    {

        items(1) {
            EachRow("Sahil Mishra", R.drawable.ph1, R.drawable.offline)

        }
        items(1) {
            EachRow("Sahil mishra", R.drawable.ph2, R.drawable.online)

        }
        items(1) {
            EachRow("Sahil mishra", R.drawable.ph3, R.drawable.offline)

        }
        items(1) {
            EachRow("Sahil mishra", R.drawable.ph4, R.drawable.online)

        }
        items(1) {
            EachRow("Sahil mishra", R.drawable.ph5, R.drawable.online)

        }
        items(1) {
            EachRow("Sahil mishra", R.drawable.ph6, R.drawable.offline)

        }
        items(1) {
            EachRow("Sahil mishra", R.drawable.ph7, R.drawable.online)

        }
        items(1) {
            EachRow("Sahil mishra", R.drawable.ph8, R.drawable.online)

        }
        items(1) {
            EachRow("Sahil mishra", R.drawable.ph9, R.drawable.online)

        }
        items(1) {
            EachRow("Sahil mishra", R.drawable.ph10, R.drawable.online)

        }


    }
}


}
@Composable
fun EachRow(user:String, image: Int, status:Int){
    Card (
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(CornerSize(10.dp)),
    )
    {
        Row(modifier = Modifier.padding(5.dp)) {

            Box {
                Image(
                    painter = painterResource(id = image), contentDescription = "image",
                    modifier = Modifier
                        .padding(8.dp)
                        .size(80.dp)
                        .clip(CircleShape)
                        .border(2.5f.dp, Color(0xFF881346), RoundedCornerShape(50))
                        .clickable {}

                )
                Image(painter = painterResource(id = status), contentDescription = null,
                    modifier = Modifier
                        .size(15.dp, 15.dp)
                        .align(Alignment.BottomEnd)
                        .offset(-12.dp, -10.dp))
            }
            Text(text = user, color = Color.White,modifier = Modifier.padding(horizontal = 10.dp, vertical = 15.dp))
        }
    }
}
@Composable
fun Loc(navHostController: NavController){
    navHostController.navigate(NavigationScreen.ThirdScreen.route)

}