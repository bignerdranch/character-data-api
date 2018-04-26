package com.bignerdranch.charactergen

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ConditionalHeaders
import io.ktor.features.DefaultHeaders
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get


fun Application.main() {
    install(DefaultHeaders)
    install(ConditionalHeaders)

    install(Routing) {
        get("/") {
            call.respondText(FantasyName.character(), ContentType.Text.Plain)
        }
    }
}