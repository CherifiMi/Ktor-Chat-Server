package com.example.di

import com.example.data.MessageDataSource
import com.example.data.MessageDataSourceImp
import com.example.room.RoomController
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val mainModule = module {
    single {
        KMongo.createClient(
            "mongodb+srv://mito:cherifi2003@mitocluster.bpzkl.mongodb.net/?retryWrites=true&w=majority"
        )
            .coroutine
            .getDatabase("chat")
    }
    single <MessageDataSource>{
        MessageDataSourceImp(get())
    }
    single {
        RoomController(get())
    }
}