package com.eddy.sokomart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import com.eddy.sokomart.navigation.ROUT_ABOUT
import com.eddy.sokomart.navigation.ROUT_HOME
import com.eddy.sokomart.navigation.ROUT_ITEM

@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){

        //CARD
        Card (
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.LightGray)
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
                    color = Color.Black,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold

                )
            }

        }
        //END CARD

        Spacer(modifier = Modifier.height(10.dp))

        //Row
        Row (modifier = Modifier.padding(start = 40.dp)){

            //CARD
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(ROUT_HOME)},
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.LightGray)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.iconhome),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "Home", fontSize = 15.sp)
                }
            }
            //END CARD

            Spacer(modifier = Modifier.height(10.dp).clickable{navController.navigate(ROUT_ABOUT)})

            Card (
                modifier = Modifier.width(150.dp).height(180.dp).padding(start = 15.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.LightGray)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "About", fontSize = 15.sp)
                }
            }

        }
        //END ROW

        Spacer(modifier = Modifier.height(10.dp))

        //ROW
        //Row
        Row (modifier = Modifier.padding(start = 40.dp)){

            //CARD
            Card (
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.LightGray)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "Contacts", fontSize = 15.sp)
                }
            }
            //END CARD

            Spacer(modifier = Modifier.height(10.dp))

            Card (
                modifier = Modifier.width(150.dp).height(180.dp).padding(start = 20.dp).clickable{navController.navigate(
                    ROUT_ITEM
                )},
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.LightGray)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "Products", fontSize = 15.sp)
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