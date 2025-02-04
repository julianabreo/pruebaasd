package com.pruebaasd.pokemonapp.data.remote.responses

data class Ability(
    val ability: com.pruebaasd.pokemonapp.data.remote.responses.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)