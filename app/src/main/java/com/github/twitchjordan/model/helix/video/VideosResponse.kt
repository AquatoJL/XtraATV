package com.github.twitchjordan.model.helix.video

import com.github.twitchjordan.model.helix.Pagination
import kotlinx.serialization.Serializable

@Serializable
class VideosResponse(
    val data: List<Video>,
    val pagination: Pagination? = null,
)