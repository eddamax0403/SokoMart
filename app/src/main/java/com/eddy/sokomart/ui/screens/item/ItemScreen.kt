package com.eddy.sokomart.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.eddy.sokomart.R
import com.eddy.sokomart.navigation.ROUT_INTENT

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

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }

                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }

            }
        )
        //end of TopAppbar

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            Image(
                painter = painterResource(R.drawable.item),
                contentDescription = "Item",
                modifier = Modifier.fillMaxWidth().height(540.dp).verticalScroll(rememberScrollState()),
                contentScale = ContentScale.FillWidth
            )

            //Searchbar
            Spacer(modifier = Modifier.height(10.dp))


            var search by remember { mutableStateOf("") }
            OutlinedTextField(
                value = search,
                onValueChange = {search = it},
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "")},
                placeholder = { Text(text = "Search...") }
            )

            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row (modifier = Modifier.padding(start = 10.dp)){
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                //Horizontal spacer
                Spacer(modifier = Modifier.width(10.dp))

                Column (){
                    Text(
                        text = "Men's Leather Jacket",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )

                    Text(
                        text = "Casual Wear",
                        fontSize = 15.sp
                    )

                    Text(
                        text = "Before:Ksh.1800",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )

                    Text(
                        text = "Now:Ksh.1500",
                        fontSize = 15.sp
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)

                    }
                }

            }
            //end of row

            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row (modifier = Modifier.padding(start = 10.dp)){
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                //Horizontal spacer
                Spacer(modifier = Modifier.width(10.dp))

                Column (){
                    Text(
                        text = "Men's Leather Jacket",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )

                    Text(
                        text = "Casual Wear",
                        fontSize = 15.sp
                    )

                    Text(
                        text = "Before:Ksh.1800",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )

                    Text(
                        text = "Now:Ksh.1500",
                        fontSize = 15.sp
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)

                    }



                }
            }
            //end of row

            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row (modifier = Modifier.padding(start = 10.dp)){
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                //Horizontal spacer
                Spacer(modifier = Modifier.width(10.dp))

                Column (){
                    Text(
                        text = "Men's Leather Jacket",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )

                    Text(
                        text = "Casual Wear",
                        fontSize = 15.sp
                    )

                    Text(
                        text = "Before:Ksh.1800",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )

                    Text(
                        text = "Now:Ksh.1500",
                        fontSize = 15.sp
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)

                    }
                }

            }
            //end of row

            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row (modifier = Modifier.padding(start = 10.dp)){
                Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                //Horizontal spacer
                Spacer(modifier = Modifier.width(10.dp))

                Column (){
                    Text(
                        text = "Men's Leather Jacket",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )

                    Text(
                        text = "Casual Wear",
                        fontSize = 15.sp
                    )

                    Text(
                        text = "Before:Ksh.1800",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )

                    Text(
                        text = "Now:Ksh.1500",
                        fontSize = 15.sp
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Green)

                    }
                }

            }
            //end of row










        }



    }
}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController= rememberNavController())
}