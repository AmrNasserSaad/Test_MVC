package com.example.test_mvc.ui.presenter

import com.example.test_mvc.ui.data.Repositry.MainRepository

class MainPresenter {


    lateinit var view: IMainView

    private val repository = MainRepository()


    fun fetchUserInfo() {
        val result = repository.getCurrentUser()
        view.onUserInfoSuccess(result)
    }

    fun fetchAWisdom() {
        val result = repository.getRandomWisdom()
        view.onWisdomSuccess(result)
    }
}