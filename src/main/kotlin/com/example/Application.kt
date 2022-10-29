package com.example

import com.example.data.models.Message
import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val client = KMongo
    .createClient(
        "mongodb+srv://mito:cherifi2003@mitocluster.bpzkl.mongodb.net/?retryWrites=true&w=majority"
    ).coroutine
val database = client.getDatabase("chat")


fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
    configureRouting()
}
