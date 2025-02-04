package com.pruebaasd.pokemonapp.data.remote.responses

data class HeldItem(
    val item: Item,
    val version_details: List<com.pruebaasd.pokemonapp.data.remote.responses.VersionDetail>
)