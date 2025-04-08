package com.eddy.sokomart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.eddy.sokomart.R

@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){

        //CARD
        Card (
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.DarkGray)
        ){
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Image(
                    painter = painterResource(R.drawable.icon),
                    contentDescription = "Home",
                    modifier = Modifier.size(150.dp)
                )

                Text(
                    text = "SokoMart",
                    fontSize = 40.sp,
                    color = Color.White,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold

                )
            }

        }
        //END CARD

        Spacer(modifier = Modifier.height(10.dp))

        //Row
        Row (modifier = Modifier.padding(start = 20.dp)){

            //CARD
            Card (
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.fruit),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "Kiwi", fontSize = 15.sp)
                }
            }
            //END CARD

            Spacer(modifier = Modifier.height(10.dp))

            Card (
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.fruit),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "Kiwi", fontSize = 15.sp)
                }
            }

        }
        //END ROW

        Spacer(modifier = Modifier.height(10.dp))

        //ROW
        //Row
        Row (modifier = Modifier.padding(start = 20.dp)){

            //CARD
            Card (
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.fruit),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "Kiwi", fontSize = 15.sp)
                }
            }
            //END CARD

            Spacer(modifier = Modifier.height(10.dp))

            Card (
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.fruit),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)                   )

                    Text(text = "Kiwi", fontSize = 15.sp)
                }
            }

        }
        //END ROW

        //END ROW


    }


}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(navController= rememberNavController())
}