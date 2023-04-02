package dev.bukreev.smallblockchain

import kotlinx.serialization.Serializable

enum class MessageType {
    REQUEST_BLOCK,

    RESPONSE_BLOCK,

    UPDATE_BLOCK,
}

@Serializable
data class Message(
    val messageType: MessageType,
    val senderId: String,
    val block: Block? = null,
)
