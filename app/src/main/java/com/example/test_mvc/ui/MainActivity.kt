package com.example.test_mvc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test_mvc.databinding.ActivityMainBinding
import com.example.test_mvc.ui.data.FakeApiService
import com.example.test_mvc.ui.data.FakeDatabase
import com.example.test_mvc.ui.data.model.User
import com.example.test_mvc.ui.data.model.Wisdom
import com.example.test_mvc.ui.presenter.IMainView
import com.example.test_mvc.ui.presenter.mainPresenter

class MainActivity : AppCompatActivity(), IMainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = mainPresenter()

    // private val api = FakeApiService() // MVC
    // private val database = FakeDatabase() /MVC


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // fetchUserInfo() // MVC

        setup()

    }

    override fun onUserInfoSuccess(user: User) {
        binding.TextUserName.text = user.username

    }

    override fun onWisdomSuccess(wisdom: Wisdom) {
        binding.apply {
            textContent.text = wisdom.content
            textDate.text = wisdom.publishData
        }
    }

    private fun setup() {
        presenter.view = this
        presenter.fetchUserInfo()
        binding.buttonFetchWisdom.setOnClickListener {
            presenter.fetchAWisdom()
        }

    }

// MVC
    /* fun fetchAWisdom(view: View) {
         val result = api.getRandomWisdom()
         binding.apply {
             textContent.text = result.content
             textDate.text = result.publishData
         }

     }

     private fun fetchUserInfo(){
         val result = database.getCurrentUser()
         binding.TextUserName.text = result.username

     }*/
}