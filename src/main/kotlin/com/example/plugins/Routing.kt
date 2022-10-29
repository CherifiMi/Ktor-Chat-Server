package com.example.plugins

import com.example.Hi
import com.example.database
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import org.litote.kmongo.json

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respond(database.find().toList())
            database.insertOne(Hi(string = "hillo")).wasAcknowledged()
        }
    }
}
