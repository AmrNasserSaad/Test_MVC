package com.example.test_mvc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test_mvc.databinding.ActivityMainBinding
import com.example.test_mvc.ui.data.FakeApiService
import com.example.test_mvc.ui.data.FakeDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val api = FakeApiService()
    private val database = FakeDatabase()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fetchUserInfo()

    }

    fun fetchAWisdom(view: View) {
        val result = api.getRandomWisdom()
        binding.apply {
            textContent.text = result.content
            textDate.text = result.publishData
        }

    }

    private fun fetchUserInfo(){
        val result = database.getCurrentUser()
        binding.TextUserName.text = result.username

    }
}