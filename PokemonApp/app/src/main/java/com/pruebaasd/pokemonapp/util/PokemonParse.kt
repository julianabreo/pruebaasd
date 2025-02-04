package com.pruebaasd.pokemonapp.util

import androidx.compose.ui.graphics.Color
import com.pruebaasd.pokemonapp.data.remote.responses.Stat
import com.pruebaasd.pokemonapp.data.remote.responses.Type
import com.pruebaasd.pokemonapp.ui.theme.AtkColor
import com.pruebaasd.pokemonapp.ui.theme.DefColor
import com.pruebaasd.pokemonapp.ui.theme.HPColor
import com.pruebaasd.pokemonapp.ui.theme.SpAtkColor
import com.pruebaasd.pokemonapp.ui.theme.SpDefColor
import com.pruebaasd.pokemonapp.ui.theme.SpdColor
import com.pruebaasd.pokemonapp.ui.theme.TypeBug
import com.pruebaasd.pokemonapp.ui.theme.TypeDark
import com.pruebaasd.pokemonapp.ui.theme.TypeDragon
import com.pruebaasd.pokemonapp.ui.theme.TypeElectric
import com.pruebaasd.pokemonapp.ui.theme.TypeFairy
import com.pruebaasd.pokemonapp.ui.theme.TypeFighting
import com.pruebaasd.pokemonapp.ui.theme.TypeFire
import com.pruebaasd.pokemonapp.ui.theme.TypeFlying
import com.pruebaasd.pokemonapp.ui.theme.TypeGhost
import com.pruebaasd.pokemonapp.ui.theme.TypeGrass
import com.pruebaasd.pokemonapp.ui.theme.TypeGround
import com.pruebaasd.pokemonapp.ui.theme.TypeIce
import com.pruebaasd.pokemonapp.ui.theme.TypeNormal
import com.pruebaasd.pokemonapp.ui.theme.TypePoison
import com.pruebaasd.pokemonapp.ui.theme.TypePsychic
import com.pruebaasd.pokemonapp.ui.theme.TypeRock
import com.pruebaasd.pokemonapp.ui.theme.TypeSteel
import com.pruebaasd.pokemonapp.ui.theme.TypeWater
import java.util.Locale

fun parseTypeToColor(
    type: Type
): Color {
    return when (type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "Rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "Dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when (stat.stat.name.lowercase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when (stat.stat.name.lowercase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}