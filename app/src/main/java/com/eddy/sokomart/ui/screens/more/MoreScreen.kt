package com.eddy.sokomart.ui.screens.more

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.eddy.sokomart.R
import com.eddy.sokomart.navigation.ROUT_INTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){

        //TopAppbar
        TopAppBar(
            title = {
                Text(text = "More Items",
                    color = Color.White)
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.DarkGray,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.Yellow

            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }


            }
        )
        //end of TopAppbar

        Spacer(modifier = Modifier.height(10.dp))

        //SEARCHBAR
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "")},
            placeholder = { Text(text = "Search for more products...") }
        )
        //END OF SEARCHBAR

        Spacer(modifier = Modifier.height(10.dp))

        //BOX LAYOUT
        Box (
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentAlignment = Alignment.Center

        ){

            Image(
                painter = painterResource(R.drawable.home),
                contentDescription = "Home",
                modifier = Modifier.fillMaxSize()
            )

            Icon(
                imageVector = Icons.Default.Favorite, contentDescription = "",
                tint = Color.Green,
                modifier = Modifier.align(alignment = Alignment.TopEnd).padding(10.dp)
            )

            Text(
                text = "Find The Best Products!!!",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.DarkGray

            )
        }
        //End of box

        Text(
            text = "Claim Your Record",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.DarkGray,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))


        //ROW
        Row (
            modifier = Modifier.padding(20.dp)
        ){



        }







    }


}

@Preview(showBackground = true)
@Composable
fun MoreScreenPreview(){
    MoreScreen(navController= rememberNavController())
}