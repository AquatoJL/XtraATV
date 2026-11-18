package com.github.twitchjordan.model.helix.clip

import com.github.twitchjordan.model.helix.Pagination
import kotlinx.serialization.Serializable

@Serializable
class ClipsResponse(
    val data: List<Clip>,
    val pagination: Pagination? = null,
)