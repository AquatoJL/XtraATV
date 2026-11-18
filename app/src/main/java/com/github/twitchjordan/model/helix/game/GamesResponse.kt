package com.github.twitchjordan.model.helix.game

import com.github.twitchjordan.model.helix.Pagination
import kotlinx.serialization.Serializable

@Serializable
class GamesResponse(
    val data: List<Game>,
    val pagination: Pagination? = null,
)