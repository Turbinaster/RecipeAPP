package com.example.recipeapp.ui.screens

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter

@Composable
fun RecipeScreen(
    navController: NavController,
    recipe: String? = null,
    photoUri: String? = null
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7DCA8))
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (!photoUri.isNullOrEmpty()) {
            Image(
                painter = rememberAsyncImagePainter(model = Uri.parse(photoUri)),
                contentDescription = "Сфотографированное блюдо",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .padding(bottom = 16.dp),
                contentScale = ContentScale.Fit
            )
        }
        if (!recipe.isNullOrEmpty()) {
            Text(
                text = recipe,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        } else {
            Text(
                text = "Рецепт не получен",
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
    }
}