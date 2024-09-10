package com.example.myapplication

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Column {
                    Box {
                        Column {
                            Text("Titulo da tarefa 01")
                            Text("Data: 20/20/2042")
                            Row {
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "Editar")
                                }
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "Finalizar")
                                }
                            }
                        }
                    }
                    Box {
                        Column {
                            Text("Titulo da tarefa 01")
                            Text("Data: 20/20/2042")
                            Row {
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "Editar")
                                }
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "Finalizar")
                                }
                            }
                        }
                    }
                    Box {
                        Column {
                            Text("Titulo da tarefa 01")
                            Text("Data: 20/20/2042")
                            Row {
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "Editar")
                                }
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "Finalizar")
                                }
                            }
                        }
                    }
                }
            } // coluna final
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}