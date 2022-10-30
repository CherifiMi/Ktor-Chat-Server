package com.example.di

import io.ktor.server.application.*
import org.koin.core.Koin

fun Application.configureKoin() {
    install(Koin) {
        modules(mainModule)
    }
}