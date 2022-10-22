package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composehomework.ui.theme.ComposeHomeworkTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeHomeworkTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
ComposeActivityCard()
                }
            }
        }
    }
}
@Composable
fun ComposeActivityCard() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            ComposeCard(
                title = "Title1",
                mainText = "Main text #1 here",
                modifier = Modifier.weight(1f),
                backgroundColor = Color.Green

            )
            ComposeCard(
                title = "Title2",
                mainText = "Main text #2 here",
                modifier = Modifier.weight(1f),
                backgroundColor = Color.Gray,
            )

        }
        Row(modifier = Modifier.weight(1f)) {
            ComposeCard(
                title = "Title3",
                mainText = "Main text#3 here",
                modifier = Modifier.weight(1f),
                backgroundColor = Color.DarkGray,
            )
            ComposeCard(
                title = "Title4",
                mainText = "Main text#4 here",
                modifier = Modifier.weight(1f),
                backgroundColor = Color.LightGray,
            )
        }
    }
}
    @Composable
    fun ComposeCard(
        title: String,
        mainText: String,
        modifier: Modifier = Modifier,
        backgroundColor: Color,
    )
    {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(3.dp)
                .background(backgroundColor),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        )
        {
            Text(
                text = title,
                fontWeight = Bold,
                modifier = Modifier.padding(2.dp),
                color = Blue,
            )
            Text(
                text = mainText,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(2.dp),
                textAlign = TextAlign.Justify,
                color = Magenta,
            )
        }
    }

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeHomeworkTheme {
ComposeActivityCard()
    }
}