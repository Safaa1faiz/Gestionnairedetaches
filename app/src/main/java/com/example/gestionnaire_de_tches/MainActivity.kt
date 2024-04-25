package com.example.gestionnaire_de_tches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestionnaire_de_tches.ui.theme.Gestionnaire_de_tâchesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gestionnaire_de_tâchesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        title = stringResource(R.string.text1),
                        textOne = stringResource(R.string.text2)

                    )
                }
            }
        }
    }




    @Composable
    fun GreetingImage(title: String, textOne: String, modifier: Modifier = Modifier) {
        val image = painterResource(R.drawable.ic_task_completed)
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        ) {
            Image(
                painter = image,
                contentDescription = null

            )
     Text(
         text = title,
         fontSize = 24.sp,
         fontWeight = FontWeight.Bold,
         color = Color.Black
     )
    Text(
        text = textOne,
        fontSize = 16.sp,
        color = Color.Black,

        )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Gestionnaire_de_tâchesTheme {
            GreetingImage(
                title = stringResource(R.string.text1),
                textOne = stringResource(R.string.text2)
            )
        }
    }
}
