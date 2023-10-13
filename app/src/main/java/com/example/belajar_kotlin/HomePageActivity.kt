package com.example.belajar_kotlin

import android.content.Intent
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


        val movieList = mutableListOf(
            Movie("Finding Nemo",R.drawable.nemo, R.string.desc, 4.9,listOf("Kids", "Animation")),
            Movie("Finding Dory",R.drawable.dory,R.string.desc, 4.8,listOf("Kids", "Animation")),
            Movie("Aladdin",R.drawable.aladdin,R.string.desc, 4.9,listOf("Kids", "Animation")),
            Movie("Toy Story",R.drawable.toystory,R.string.desc, 4.9,listOf("Kids", "Animation")),
            Movie("Toy Story 3",R.drawable.toystory3,R.string.desc, 4.9,listOf("Kids", "Animation")),
            Movie("Luca",R.drawable.luca,R.string.desc, 4.9,listOf("Kids", "Animation")),
        )



        val adapter = MovieAdapter(movieList) { clickedMovie ->
            val intent = Intent(this, MovieDetail::class.java)
            intent.putExtra("movieData", clickedMovie)
            startActivity(intent)
        }

        with(binding){
            tvUsername.text = username
            rvMovies.adapter = adapter
        }
    }
}