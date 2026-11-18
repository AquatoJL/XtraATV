package com.github.twitchjordan.model.gql.chat

import com.github.twitchjordan.model.gql.Error
import kotlinx.serialization.Serializable

@Serializable
class SendChatMessageResponse(
    val errors: List<Error>? = null,
    val data: Data? = null,
) {
    @Serializable
    class Data(
        val sendChatMessage: Payload? = null,
    )

    @Serializable
    class Payload(
        val dropReason: String? = null,
        val dropReasonMessage: String? = null,
    )
}
