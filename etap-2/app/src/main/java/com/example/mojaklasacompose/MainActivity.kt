
package com.example.mojaklasacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MojaKlasa("4TD")
                }
            }
        }
    }
}

@Composable
fun MojaKlasa(klasa: String) {
    Column(modifier = Modifier.padding(24.dp)) {
        Text(
            text = "Moja klasa",
            fontSize = 30.sp
        )

        Text(
            text = "Technikum Informatyczne",
            fontSize = 22.sp
        )

        Text(
            text = "Klasa: $klasa",
            fontSize = 20.sp
        )

        Text(
            text = "Kierunek: Technik informatyk",
            fontSize = 18.sp
        )

        Text(
            text = "Uczymy sie programowania i sieci.",
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MojaKlasaPreview() {
    MaterialTheme {
        MojaKlasa("4TD")
    }
}
