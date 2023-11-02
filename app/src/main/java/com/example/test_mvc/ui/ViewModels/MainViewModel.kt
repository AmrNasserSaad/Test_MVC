package com.example.test_mvc.ui.ViewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test_mvc.ui.data.Repositry.MainRepository
import com.example.test_mvc.ui.data.model.User
import com.example.test_mvc.ui.data.model.Wisdom

class MainViewModel : ViewModel() {
    private val repository = MainRepository()
    val currentUser = MutableLiveData<User>()
    val wisdom = MutableLiveData<Wisdom>()


    fun getUserInfo() {
        currentUser.postValue(repository.getCurrentUser())
    }

    fun getAWisdom() {
        wisdom.postValue(repository.getRandomWisdom())
    }
}