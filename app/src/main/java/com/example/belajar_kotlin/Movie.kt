package com.example.belajar_kotlin

data class Movie (
    val title: String,
    val imageResourceId: Int,
    val desc: String,
    val rate: Int,
    val genres: List<String>
)