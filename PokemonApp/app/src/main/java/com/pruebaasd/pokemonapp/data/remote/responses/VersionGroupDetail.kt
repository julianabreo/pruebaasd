package com.pruebaasd.pokemonapp.data.remote.responses

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: MoveLearnMethod,
    val version_group: com.pruebaasd.pokemonapp.data.remote.responses.VersionGroup
)