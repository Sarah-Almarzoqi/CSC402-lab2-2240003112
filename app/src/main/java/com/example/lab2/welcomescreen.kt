package com.example.lab2
import androidx.compose.foundation.background import androidx.compose.foundation.layout.Box import androidx.compose.foundation.layout.Column import androidx.compose.foundation.layout.Spacer import androidx.compose.foundation.layout.fillMaxSize import androidx.compose.foundation.layout.fillMaxWidth import androidx.compose.foundation.layout.height import androidx.compose.foundation.layout.padding import androidx.compose.foundation.layout.size import androidx.compose.foundation.shape.CircleShape import androidx.compose.foundation.shape.RoundedCornerShape import androidx.compose.material3.Card import androidx.compose.material3.Text import androidx.compose.runtime.Composable import androidx.compose.ui.Alignment import androidx.compose.ui.Modifier import androidx.compose.ui.draw.clip import androidx.compose.ui.graphics.Color import androidx.compose.ui.text.font.FontWeight import androidx.compose.ui.tooling.preview.Preview import androidx.compose.ui.unit.dp import androidx.compose.ui.unit.sp
@Composable fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F7FA))
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0B2545))
                .padding(20.dp)
        ) {
            Text(
                text = "CSC 402 Lab 2",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Task 6 - My First Screen",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            shape = RoundedCornerShape(16.dp)
        ) {

            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF0B2545)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "JU",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Hello, Jubail!",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Welcome to CSC 402.",
                    color = Color.Gray
                )

                Text(
                    text = "This is my first Compose screen.",
                    color = Color.Gray
                )

                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(0xFF3DDC84))
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Built with Jetpack Compose"
                    )
                }
            }
        }
    }
}
@Preview
    (showBackground = true)
@Composable
fun WelcomeScreenPreview() { WelcomeScreen() }