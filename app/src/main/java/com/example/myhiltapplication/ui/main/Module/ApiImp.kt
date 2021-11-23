package com.example.myhiltapplication.ui.main.Module

import com.example.myhiltapplication.model.UserModel
import retrofit2.Response
import javax.inject.Inject

class ApiImp @Inject constructor(private val apiService: ApiService) : ApiInterface {

    override suspend fun getUsers(): Response<List<UserModel>> = apiService.getUsers()

}