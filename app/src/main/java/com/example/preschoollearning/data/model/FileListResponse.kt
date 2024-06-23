package com.example.preschoollearning.data.model

data class FileListResponse(    val files: List<GoogleDriveFile>,
                                val nextPageToken: String?)
