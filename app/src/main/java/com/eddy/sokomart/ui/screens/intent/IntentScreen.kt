package com.eddy.sokomart.ui.screens.intent

import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.eddy.sokomart.navigation.ROUT_ITEM
import com.eddy.sokomart.navigation.ROUT_MORE

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current


        //TopAppbar
        TopAppBar(
            title = {
                Text(text = "Intents",
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
                    Icon(imageVector = Icons.Default.Share, contentDescription = "")
                }

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "")
                }

                IconButton(onClick = {
                    navController.navigate(ROUT_MORE)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }

            }
        )
        //end of TopAppbar

        Spacer(modifier = Modifier.height(10.dp))


        //MPESA
        Button(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                         },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "MPESA")
        }


        Spacer(modifier = Modifier.height(10.dp))


        //SMS
        Button(onClick = {
            val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0117042224".toUri()
            smsIntent.putExtra("sms_body","Hello Eddy,how was your day?")
            mContext.startActivity(smsIntent)

        },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "SMS")
        }


        Spacer(modifier = Modifier.height(10.dp))

        //CALL
        Button(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0117042224".toUri()
            mContext.startActivity(callIntent)
        },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "CALL")
        }


        Spacer(modifier = Modifier.height(10.dp))


        //SHARE
        Button(onClick = {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
        },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "SHARE")
        }


        Spacer(modifier = Modifier.height(10.dp))


        //CAMERA
        Button(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                mContext.startActivity(cameraIntent)
            }else{
                println("Camera app is not available")
            }

        },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "CAMERA")
        }


        Spacer(modifier = Modifier.height(10.dp))


        //EMAIL
        Button(onClick = {
            val Intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("mwanziaedwin5@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT,"SUBJECT")
                putExtra(Intent.EXTRA_TEXT,"Hello,this is the body")
            }
            mContext.startActivity(Intent)

        },

            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "EMAIL")
        }


    }


}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(navController= rememberNavController())
}