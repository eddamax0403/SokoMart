package com.eddy.sokomart.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.eddy.sokomart.R

@Composable
fun StartScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

        )
    {
        Text(
            text = "Make ur move!!!",
            fontSize = 30.sp
        )


        Image(
            painter = painterResource(R.drawable.start),
            contentDescription = "Welcome",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Claim the opportunity.",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Hello dear esteemed client, thanks for placing your order with us. Your package is being processed and will be on its way soon. You can track your order at from our app with the link provided.",
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))


        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "Claim")
        }



    }


}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(navController= rememberNavController())
}