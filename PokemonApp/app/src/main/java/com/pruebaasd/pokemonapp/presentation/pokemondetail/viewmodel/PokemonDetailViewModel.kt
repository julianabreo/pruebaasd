package com.pruebaasd.pokemonapp.presentation.pokemondetail.viewmodel

import androidx.lifecycle.ViewModel
import com.pruebaasd.pokemonapp.data.remote.responses.Pokemon
import com.pruebaasd.pokemonapp.repository.PokemonRepository
import com.pruebaasd.pokemonapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}