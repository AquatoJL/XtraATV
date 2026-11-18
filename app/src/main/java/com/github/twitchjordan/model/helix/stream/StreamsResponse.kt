package com.github.twitchjordan.model.helix.stream

import com.github.twitchjordan.model.helix.Pagination
import kotlinx.serialization.Serializable

@Serializable
class StreamsResponse(
    val data: List<Stream>,
    val pagination: Pagination? = null,
)