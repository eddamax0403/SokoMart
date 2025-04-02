package com.eddy.sokomart.ui.screens.item

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize(),
        )

    {
        //TopAppbar
        TopAppBar(
            title = {
                Text(text = "Item",
                    color = Color.White)
                    },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.DarkGray,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")


                }
            }

        )




    }








}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController= rememberNavController())
}