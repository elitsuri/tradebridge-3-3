package com.app

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.http.*
import kotlinx.serialization.Serializable

@Serializable
data class HealthResponse(val status: String, val service: String)

fun main() {
    val port = System.getenv("PORT")?.toIntOrNull() ?: 8080
    embeddedServer(Netty, port = port, module = Application::module).start(wait = true)
}

fun Application.module() {
    routing {
        get("/health") {
            call.respond(HttpStatusCode.OK, HealthResponse("ok", "tradebridge-3"))
        }
        route("/api/v1") {
            get("/items") {
                call.respond(HttpStatusCode.OK, emptyList<String>())
            }
        }
    }
}
