package com.example.lazy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazy.ui.theme.LazyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GamesScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun GamesScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Meus jogos favoritos",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value = "",
            onValueChange = {/* TODO */},
            modifier = Modifier.fillMaxWidth(),
            label = {Text("Nome do estúdio")},
            trailingIcon = {
                IconButton(onClick = {/* TODO */}) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        ""
                    )
                }
            }
        )
        LazyColumn() {
            item {
                Text(text = "Item 1")
            }
            item {
                Text(text = "Item 2")
            }
            item {
                Text(text = "Item 3")
            }
        }
    }
}