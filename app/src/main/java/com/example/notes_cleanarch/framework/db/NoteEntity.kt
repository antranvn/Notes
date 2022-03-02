package com.example.notes_cleanarch.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.core.data.Note

@Entity(tableName = "note")
data class NoteEntity(
    val title: String,
    val content: String,

    @ColumnInfo(name = "creation_date")
    val creationTime: Long,
    @ColumnInfo(name = "update_time")
    val updateTime: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L
) {
    companion object {
        // We don't need to create NoteEntity instance to convert it
        fun fromNote(note: Note) = NoteEntity(
            note.title, note.content,
            note.creationTime, note.updateTime
        )
    }
    // We need NoteEntity instance to get the values
    fun toNote() = Note(title, content, creationTime, updateTime, id)
}
