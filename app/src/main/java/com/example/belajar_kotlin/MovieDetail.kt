package com.example.belajar_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajar_kotlin.databinding.ActivityMovieDetailBinding

class MovieDetail : AppCompatActivity() {

    private lateinit var binding: ActivityMovieDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val movie = intent.getSerializableExtra("movieData") as Movie

        with(binding){
            tvBack.setOnClickListener{
                finish()
            }
            image.setImageResource(movie.imageResourceId)
            tvTitle.text = movie.title
            tvDesc.setText(movie.desc)
            tvRate.text="Rate : "+ movie.rate
        }
    }
}