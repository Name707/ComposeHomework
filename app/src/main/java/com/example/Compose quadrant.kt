package com.example

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composehomework.R
import com.example.composehomework.ui.theme.ComposeHomeworkTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeHomeworkTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    ComposeQuadrant()


                }
            }
        }
    }
}
@Composable
fun ComposeQuadrant() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposeCard(
                title = "Title1",
                description = "main text",
                modifier = Modifier.weight(1f),
            )
            ComposeCard(
                title = "Title2",
                description = "main text",
                modifier = Modifier.weight(1f),

                )
        }
            Row(Modifier.weight(1f)) {
                ComposeCard(
                    title = "Title3",
                    description = "main text",
                    modifier = Modifier.weight(1f),
                )
                ComposeCard(
                        title = "Title4",
                        description = "main text",
                        modifier = Modifier.weight(1f),
                )

            }
            }
        }


@Composable
fun ComposeCard(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
    )
{
 Column(
     modifier = modifier
         .fillMaxSize()
         .padding(16.dp),
     horizontalAlignment = Alignment.CenterHorizontally,
     verticalArrangement = Arrangement.Center,

      )
 {
     Text(
         text = title,
         modifier = Modifier.padding(bottom = 16.dp),
         fontWeight = FontWeight.Bold,
         style = TextStyle(
         color = Cyan
         ),

     )
     Text(
         text = description,
         textAlign = TextAlign.Justify,
     )
 }

}
@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeHomeworkTheme {
ComposeQuadrant ()
    }
}