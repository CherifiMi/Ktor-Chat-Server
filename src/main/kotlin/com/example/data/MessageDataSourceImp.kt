package com.example.data

import com.example.data.models.Message
import org.litote.kmongo.coroutine.CoroutineDatabase

class MessageDataSourceImp(
    private val db: CoroutineDatabase
): MessageDataSource {

    private val messages = db.getCollection<Message>("chat1")

    override suspend fun getAllMessages(): List<Message> {
        return listOf()
    }

    override suspend fun insertMessage(message: Message) {

    }
}