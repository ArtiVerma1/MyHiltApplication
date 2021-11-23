package com.example.myhiltapplication.ui.main.Module

import com.example.myhiltapplication.model.UserModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("api/users?page=1")
    suspend fun getUsers(): Response<List<UserModel>>
}