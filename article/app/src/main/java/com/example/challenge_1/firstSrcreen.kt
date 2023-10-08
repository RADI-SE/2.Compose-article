package com.example.challenge_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.challenge_1.ui.theme.Challenge_1Theme

class firstScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Challenge_1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    screen()
                }
            }
            //Created by 27558 /
        }
    }
}
@Composable
fun screen() {
    Column (
        verticalArrangement =Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,

        modifier = Modifier
            .fillMaxSize()
            .padding(35.dp)
    ) {
        Text(
            text = "Welcome to ",
            fontSize = 30.sp,
            )
        Text(
            text = "Smart Article",
            fontSize = 30.sp,
        )

        Text(
            text = "We believe that everyone has a story to tell and that everyone's voice deserves to be heard. " +
                    "That's why we are committed to publishing articles from a wide range of authors, " +
                    "with different perspectives and experiences.\n",
            textAlign =TextAlign.Center,
            modifier = Modifier
                .padding(20.dp)
            )
        Image(painter = painterResource(id = R.drawable.home), contentDescription = "",
                modifier = Modifier
                    .size(300.dp)
        )
        Button(
            onClick = { /* TODO: Handle button click here */ },
            modifier = Modifier
                .height(50.dp)
                .width(250.dp)
                .padding(16.dp)
                .background(color = Color.Yellow), // Set the background color here
            colors = ButtonDefaults.textButtonColors(contentColor = Color.Black) // Set the text color
        ) {
            Text(text = "Click Me",
                
            )
        }


    }

}
@Preview(showBackground = true)
@Composable
//Created by Radi /
fun screenPreview() {
    Challenge_1Theme {
        screen()
    }
}