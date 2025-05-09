package com.brainoverflow.server.external.dto.response.chat

import com.brainoverflow.server.domain.chat.ChatRoom
import java.time.LocalDateTime

data class ChatRoomDto(
    val roomId: Long,
    val roomName: String,
    val lastMessage: String?,
    val lastMessageTime: LocalDateTime
) {
    companion object {
        fun from(chatRoom: ChatRoom): com.brainoverflow.server.external.dto.response.chat.ChatRoomDto {
            return com.brainoverflow.server.external.dto.response.chat.ChatRoomDto(
                chatRoom.id,
                chatRoom.name,
                "hello?",
                LocalDateTime.now()
            )
        }
    }
}