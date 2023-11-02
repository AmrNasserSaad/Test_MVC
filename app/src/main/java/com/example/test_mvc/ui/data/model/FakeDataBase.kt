package com.example.test_mvc.ui.data.model

import com.example.test_mvc.ui.data.model.User

class FakeDatabase {
    fun getCurrentUser(): User {
        return User("Amr Nasser ", 2003)
    }
}