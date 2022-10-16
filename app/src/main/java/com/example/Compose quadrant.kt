package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ComposeQuadrant(firstText = "1", secondText = "2", thirdText = "3", fouthText = "4")

                }
            }
        }
    }
}
@Composable
fun ComposeQuadrant(firstText: String, secondText: String, thirdText: String, fouthText: String) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
  ) {
        Text(
            text = firstText,

            )
        Text(
            text = secondText
        )
    }
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight())  {

        Text(
            text = thirdText
        )
        Text(
            text = fouthText
        )
    }
    }

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeHomeworkTheme {
ComposeQuadrant ("1", "2", "3", "4")
    }
}