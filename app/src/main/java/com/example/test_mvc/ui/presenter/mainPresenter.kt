package com.example.test_mvc.ui.presenter

import android.view.View
import com.example.test_mvc.ui.data.FakeApiService
import com.example.test_mvc.ui.data.FakeDatabase

class mainPresenter {
    private val api = FakeApiService()
    private val database = FakeDatabase()
    lateinit var view: IMainView

    fun fetchUserInfo() {
        val result = database.getCurrentUser()
        view.onUserInfoSuccess(result)
    }

    fun fetchAWisdom() {
        val result = api.getRandomWisdom()
        view.onWisdomSuccess(result)
    }
}