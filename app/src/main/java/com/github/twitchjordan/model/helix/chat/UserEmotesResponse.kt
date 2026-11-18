package com.github.twitchjordan.model.helix.chat

import com.github.twitchjordan.model.helix.Pagination
import kotlinx.serialization.Serializable

@Serializable
class UserEmotesResponse(
    val template: String,
    val data: List<EmoteTemplate>,
    val pagination: Pagination? = null,
)