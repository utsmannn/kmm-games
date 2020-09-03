package alfianyusufabdullah.exp.games.shared.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GameResponse(
    @SerialName("results")
    val games: List<Game>
)