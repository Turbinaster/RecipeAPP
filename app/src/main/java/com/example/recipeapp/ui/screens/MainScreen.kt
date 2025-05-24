package com.example.recipeapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recipeapp.R

@Composable
fun MainScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7DCA8))
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* Пока без функционала */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.write),
                    contentDescription = "Написать",
                    modifier = Modifier.size(48.dp),
                    tint = Color.Black
                )
            }
            IconButton(
                onClick = { navController.navigate("camera") },
                modifier = Modifier.size(72.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.camera),
                    contentDescription = "Сфотографировать блюдо",
                    modifier = Modifier.size(72.dp),
                    tint = Color.Black
                )
            }
            IconButton(onClick = { /* Пока без функционала */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.microphone),
                    contentDescription = "Микрофон",
                    modifier = Modifier.size(48.dp),
                    tint = Color.Black
                )
            }
        }
    }
}