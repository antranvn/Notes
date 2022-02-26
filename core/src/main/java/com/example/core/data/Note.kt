package com.example.core.data

data class Note(
    var title: String,
    var content: String,
    var creationTime: String,
    var updateTime: Long,
    var id: Long = 0
)
