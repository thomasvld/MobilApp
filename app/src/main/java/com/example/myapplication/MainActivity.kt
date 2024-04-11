package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ){
                    Text("Bienvenue sur scan ou cannes")
                    Text(text = "Choisissez quel manga vous souhaitez lire :")
                    Application()
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = " $name!",
        modifier = modifier
    )
}

@Preview(  //Pour background+en-tete
    showBackground = true,
    showSystemUi = true,
    name = "My Preview"
)

@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ){
        Text("Bienvenue sur scan ou cannes")
        Text(text = "Choisissez quel manga vous souhaitez lire")

        Application()
        }
    }
}


@Composable
fun Application(){
    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "Bleach")
    }

    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "Dragon Ball")
    }

    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "Naruto")
    }
    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "One Piece")
    }
}