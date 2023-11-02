package com.example.test_mvc.ui.data.Repositry

import com.example.test_mvc.ui.data.model.FakeApiService
import com.example.test_mvc.ui.data.model.FakeDatabase

class MainRepository {
    private val api = FakeApiService()
    private val database = FakeDatabase()

    fun getCurrentUser() = database.getCurrentUser()
    fun getRandomWisdom()= api.getRandomWisdom()
}