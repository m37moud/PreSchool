package com.example.preschoollearning.repository

import com.example.preschoollearning.data.model.FileListResponse
import com.example.preschoollearning.data.remote.GoogleDriveApi
import com.example.preschoollearning.utils.Resource
import javax.inject.Inject

class PreSchoolRepository @Inject constructor(private val googleDriveApi: GoogleDriveApi) {
    suspend fun getFiles(authHeader: String, query: String): Resource<FileListResponse> {
        val response = try {
            googleDriveApi.getFiles(authHeader = authHeader, query = query)
        } catch (e: Exception) {
            return Resource.Error(e.message.toString())
        }
        return Resource.Success(response)
    }
}