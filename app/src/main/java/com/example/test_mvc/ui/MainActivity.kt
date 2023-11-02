package com.example.test_mvc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.test_mvc.databinding.ActivityMainBinding
import com.example.test_mvc.ui.ViewModels.MainViewModel
import com.example.test_mvc.ui.data.model.User
import com.example.test_mvc.ui.data.model.Wisdom
import com.example.test_mvc.ui.presenter.IMainView
import com.example.test_mvc.ui.presenter.MainPresenter

class MainActivity : AppCompatActivity()/*, IMainView */ /* Mvp*/ {

    private lateinit var binding: ActivityMainBinding

    // private val presenter = MainPresenter() // MVP
    private val viewModel: MainViewModel by viewModels()

    // private val api = FakeApiService() // MVC
    // private val database = FakeDatabase() /MVC


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // fetchUserInfo() // MVC

        setup()

    }


    private fun setup() {
        //  presenter.view = this // MVP
        // presenter.fetchUserInfo() //MVP
        viewModel.getUserInfo()

        binding.buttonFetchWisdom.setOnClickListener {
            // presenter.fetchAWisdom() //MVP
            viewModel.getAWisdom()
        }

        viewModel.currentUser.observe(this) {
            binding.TextUserName.text = it.username
        }

        viewModel.wisdom.observe(this) {
            binding.apply {
                textDate.text = it.publishData
                textContent.text = it.content
            }
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

    // MVP
    /*  override fun onUserInfoSuccess(user: User) {
          binding.TextUserName.text = user.username

      }

      override fun onWisdomSuccess(wisdom: Wisdom) {
          binding.apply {
              textContent.text = wisdom.content
              textDate.text = wisdom.publishData
          }
      }*/
}