package com.github.twitchjordan.model.misc

import kotlinx.serialization.Serializable

@Serializable
class RecentMessagesResponse(
    val messages: List<String>,
)