package com.example.practice1.Repository

import com.example.practice1.fakeApiService
import com.example.practice1.fakeDatabase

class MainRepository {

    private val api = fakeApiService()
    private val database = fakeDatabase()

    fun getCurrentUser()= database.getCurrentUser()
    fun getRandomWisdom() = api.getRandomWisdom()

}