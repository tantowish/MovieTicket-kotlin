package com.example.belajar_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajar_kotlin.databinding.ActivityHomePageBinding

class HomePageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val username = intent.getStringExtra("usn")

        with(binding){
            tvUsername.text = username
        }
    }
}