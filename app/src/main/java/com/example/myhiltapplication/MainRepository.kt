package com.example.myhiltapplication

import com.example.myhiltapplication.ui.main.Module.ApiInterface
import com.example.myhiltapplication.ui.main.Module.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiService) {

    suspend fun getUsers() =  apiHelper.getUsers()
}