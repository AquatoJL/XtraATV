package com.github.twitchjordan.model.helix.follower

import com.github.twitchjordan.model.helix.Pagination
import kotlinx.serialization.Serializable

@Serializable
class FollowersResponse(
    val data: List<Follower>,
    val pagination: Pagination? = null,
)