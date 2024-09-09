package com.example.tarafazero

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarafazero.ui.theme.TarafaZeroTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarafaZeroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column { // coluna principal //
                    var caixa01 =    Box { // caixa 01 //
                            Column { // coluna da box01 //

                                var NTarefa = 1                  // numero tarefa    INT
                                var NmTarefa = Text("")     // assim que apertar enter no edit mode ele insert txt //
                                var DtTarefa = Text("")     // assim que apertar enter no edit mode ele insert txt //
                                
                                var CPTexto = rememberSaveable {
                                    mutableStateOf("a");
                                }
                                Log.i(TAG, "a, $CPTexto")

                                TextField(
                                    value = CPTexto.value,
                                    onValueChange = {
                                        val it = ""
                                        Log.d(TAG, "o app, $it")
                                        CPTexto.value = it
                                    })

                                Button( //BTN Editar
                                    onClick = { }) {
                                    Text("Editar")

                                }

                                Button( onClick = {
                                    fun finalizaTarefa(){

                                    }
                                }) {
                                    Text("Finalizar")
                                }




                            } // final da coluna dentro da Box //


                            }//final box01
                    } // final da coluna 01




                //   Greeting(
                 //       name = "Android",
                 //       modifier = Modifier.padding(innerPadding)
                 //   )
                }
            }
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
    TarafaZeroTheme {
        Greeting("Android")
    }
}