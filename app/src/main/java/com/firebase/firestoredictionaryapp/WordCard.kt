package com.firebase.firestoredictionaryapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun WordCard(word: Word) {
    Text(
        text ="Word: " +  word.word,
        color = Color.Black,
        modifier = Modifier
            .background(Color.LightGray)
            .padding(12.dp)
            .fillMaxWidth()
    )
    Text(
        text = "German Equivalent: " + word.german_equivalent,
        color = Color.Black,
        modifier = Modifier
            .background(Color.LightGray)
            .padding(12.dp)
            .fillMaxWidth()
    )
    Text(
        text = "English Definition: " + word.definition_in_english,
        color = Color.Black,
        modifier = Modifier
            .background(Color.LightGray)
            .padding(12.dp)
            .fillMaxWidth()
    )
}

