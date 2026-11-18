package com.github.twitchjordan.model.helix.follow

import com.github.twitchjordan.model.helix.Pagination
import kotlinx.serialization.Serializable

@Serializable
class FollowsResponse(
    val data: List<Follow>,
    val pagination: Pagination? = null,
)