package com.example.pokedex.data.model

data class Pokemon(
    val id: Int,
    val name: String,
    val types: List<Type>,
    // Add other relevant fields
)