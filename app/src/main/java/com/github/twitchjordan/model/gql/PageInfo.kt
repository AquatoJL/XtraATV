package com.github.twitchjordan.model.gql

import kotlinx.serialization.Serializable

@Serializable
class PageInfo(
    val hasNextPage: Boolean? = null,
)