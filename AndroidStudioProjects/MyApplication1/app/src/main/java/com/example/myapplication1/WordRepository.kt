package com.example.myapplication1

import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: MainActivity.WordDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allWords: LiveData<List<MainActivity.Word>> = wordDao.getAlphabetizedWords()

    suspend fun insert(word: MainActivity.Word) {
        wordDao.insert(word)
    }
}