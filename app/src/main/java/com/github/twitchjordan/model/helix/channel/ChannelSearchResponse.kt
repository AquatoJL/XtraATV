package com.github.twitchjordan.model.helix.channel

import com.github.twitchjordan.model.helix.Pagination
import kotlinx.serialization.Serializable

@Serializable
class ChannelSearchResponse(
    val data: List<ChannelSearch>,
    val pagination: Pagination? = null,
)