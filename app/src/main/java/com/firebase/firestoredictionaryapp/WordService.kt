package com.firebase.firestoredictionaryapp

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

val db = Firebase.firestore.collection("words")

fun addWord(word: Word) {
    db.document(word.word)
        .set(word)
        .addOnSuccessListener { Log.d(TAG, "DocumentSnapshot successfully written!") }
        .addOnFailureListener { e -> Log.w(TAG, "Error writing document", e) }
}

@Composable
fun GetData(words: SnapshotStateList<Word>) {
     val db = FirebaseFirestore.getInstance()
    db.collection("words").get().addOnSuccessListener {
        words.updateList(it.toObjects(Word::class.java))
    }.addOnFailureListener {
        words.updateList(listOf())
    }
}

fun <T> SnapshotStateList<T>.updateList(newList: List<T>){
    clear()
    addAll(newList)
}
