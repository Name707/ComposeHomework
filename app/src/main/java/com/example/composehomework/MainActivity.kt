package com.example.composehomework

import android.graphics.Paint.Align
import android.graphics.fonts.FontStyle
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composehomework.ui.theme.ComposeHomeworkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeHomeworkTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                ComposeArticleImage("All tasks completed",
                    "Nice work!",
                )
                }
            }
        }
    }
}
@Composable
fun ComposeArticleImage(header: String, secondText: String) {
    val image = painterResource(id = R.drawable.task_completed)
    Column(modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        )
    {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()

        )

            ComposeArticleText(
                header = header,
                secondText = secondText,

                )
        }
    }

@Composable
fun ComposeArticleText(header: String, secondText: String) {
    Column {
        Text(
            text = header,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            ),
            modifier = Modifier.padding(
                bottom = 8.dp,
                top = 24.dp,
            )
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
                Text(
            text = secondText,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
        )
    }

}


@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeHomeworkTheme {
        ComposeArticleImage("All tasks completed",
            "Nice work!"
        )
    }
}