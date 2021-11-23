package com.example.myhiltapplication.ui.main.Module

import com.example.myhiltapplication.model.UserModel
import dagger.Binds
import dagger.Component
import dagger.Provides
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import javax.inject.Singleton


interface ApiInterface {
   // @GET("api/users?page=1")
//    fun getall(): Call<UserModel>
    suspend fun getUsers(): Response<List<UserModel>>
}