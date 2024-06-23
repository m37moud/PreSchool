package com.example.preschoollearning.data.model

data class GoogleDriveFile(
    val id: String,
    val name: String,
    val mimeType: String,
    val parents: List<String>,
    val createdTime: String,
    val modifiedTime: String
)
