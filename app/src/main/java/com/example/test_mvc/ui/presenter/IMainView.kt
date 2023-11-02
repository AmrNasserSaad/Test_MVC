package com.example.test_mvc.ui.presenter

import com.example.test_mvc.ui.data.model.User
import com.example.test_mvc.ui.data.model.Wisdom

interface IMainView {
    fun onUserInfoSuccess(user: User)
    fun onWisdomSuccess(wisdom: Wisdom)
}