package com.example.makenotes

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun inset(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("Select *from notes_table order by id ASC")
    fun getALLNotes(): LiveData<List<Note>>
}