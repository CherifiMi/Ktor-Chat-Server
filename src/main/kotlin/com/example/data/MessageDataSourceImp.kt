package com.example.data

import com.example.data.models.Message
import org.litote.kmongo.coroutine.CoroutineDatabase

class MessageDataSourceImp(
    db: CoroutineDatabase
) : MessageDataSource {

    private val messages = db.getCollection<Message>("chat1")

    override suspend fun getAllMessages(): List<Message> {
        return messages.find().descendingSort(Message::timestamp).toList()
    }

    override suspend fun insertMessage(message: Message) {
        messages.insertOne(message)
    }
}