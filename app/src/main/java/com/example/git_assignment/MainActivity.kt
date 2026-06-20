package com.example.git_assignment

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.git_assignment.ui.theme.GitassignmentTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            GitassignmentTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    val context = LocalContext.current


    Column(
        modifier = modifier
    ) {

        // Nút Xin chào
        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Xin chào, 안녕하세요",
                    Toast.LENGTH_SHORT
                ).show()
            }
        ) {
            Text(text = "Hello $name")
        }


        // Nút Tạm biệt
        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Tạm biệt",
                    Toast.LENGTH_SHORT
                ).show()
            }
        ) {
            Text(text = "Goodbye")
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    GitassignmentTheme {
        Greeting("Android")
    }

}