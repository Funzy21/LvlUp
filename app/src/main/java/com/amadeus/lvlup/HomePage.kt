package com.amadeus.lvlup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amadeus.lvlup.ui.theme.LvlUpTheme

class HomePage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(color = Color.Blue),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
                    ){
                Text("Hello")
                Text("World")
            }

            Row (
                Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(color = Color.Cyan),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Text("This is a test to distinguish rows from columns")
                Text("The spacing is even!!!")
            }
        }
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LvlUpTheme {
        Greeting("Android")
    }
}