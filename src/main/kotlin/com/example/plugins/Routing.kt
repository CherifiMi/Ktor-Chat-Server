package com.example.plugins

import com.example.database
import com.example.data.models.Message
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respond(database.find().toList())
            //database.insertOne(Hi(string = "hillo")).wasAcknowledged()
        }
    }
}
