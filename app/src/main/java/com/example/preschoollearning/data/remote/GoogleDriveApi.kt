package com.example.preschoollearning.data.remote

import com.example.preschoollearning.data.model.FileListResponse
import com.example.preschoollearning.data.model.GoogleDriveFile
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import okhttp3.logging.HttpLoggingInterceptor.Level

interface GoogleDriveApi {
    @GET("files")
    suspend fun getFiles(
        @Header("Authorization") authHeader: String,
        @Query("q") query: String
    ): FileListResponse

    companion object {
        const val BASE_URL = "https://www.googleapis.com/drive/v3/"
//        private val client = OkHttpClient.Builder().build()
fun create(): GoogleDriveFile {
    val logger = HttpLoggingInterceptor().apply { level = Level.BASIC }

    val client = OkHttpClient.Builder()
        .addInterceptor(logger)
		.connectTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
        .build()
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(client)
        .build()
        .create(GoogleDriveFile::class.java)
}
    }
}