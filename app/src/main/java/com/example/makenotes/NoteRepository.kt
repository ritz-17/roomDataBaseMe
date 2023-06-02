package com.example.makenotes

import androidx.lifecycle.LiveData
import androidx.room.Insert

class NoteRepository(private val noteDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getALLNotes()

    suspend fun insert(note: Note){
        noteDao.inset(note)
    }

    suspend fun delete(note: Note){
        noteDao.delete(note)
    }
}