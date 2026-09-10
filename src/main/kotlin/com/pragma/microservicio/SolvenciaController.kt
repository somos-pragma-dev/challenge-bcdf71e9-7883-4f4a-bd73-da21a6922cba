package com.pragma.microservicio

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.request.receive
import io.ktor.response.respondText
import io.ktor.routing.post
import io.ktor.routing.routing
import kotlinx.coroutines.runBlocking

object SolvenciaController {

    fun registerRoutes(application: Application) {
        application.routing {
            post("/evaluate-solvencia") {
                val operationId = call.receive<String>()
                val result = runBlocking { SolvenciaService.evaluateSolvencia(operationId) }
                call.respondText(result)
            }
        }
    }
}