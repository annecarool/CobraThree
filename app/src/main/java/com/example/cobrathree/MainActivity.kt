package com.example.cobrathree

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cobrathree.ui.theme.CobraThreeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CobraThreeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Fundo()
                    Cabecalho()
                    Rodapé()
                }
            }
        }
    }
}

@Composable
        fun Fundo() {

            val imagemFundo = painterResource(id = R.drawable.fundogato)
            Image(
                painter = imagemFundo,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

        }

@Composable
        fun Cabecalho() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

      Image(
          painter = painterResource(id = R.drawable.imageanne),
          contentDescription = null,
          contentScale = ContentScale.Crop,
          modifier = Modifier
              .size(100.dp)
              .clip(RoundedCornerShape(100.dp))
      )

      Text("Anne Gomes", fontSize = 30.sp, Color.White

      )
      Text("Designer", fontSize = 20.sp,
      )
        }
    }

@Composable
    fun Rodapé() {

        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
        ){
            Row () {
                Image(
                    painter = painterResource(id = R.drawable.),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(100.dp))
                )

                Text("", fontSize = 30.sp,
                )
            }

        }

            }
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CobraThreeTheme {
        Cabecalho()
    }
}