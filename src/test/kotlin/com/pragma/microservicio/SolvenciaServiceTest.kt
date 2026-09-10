package com.pragma.microservicio

import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import io.ktor.http.HttpMethod
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.post
import io.ktor.routing.routing
import io.ktor.util.KtorExperimentalAPI
import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.test.assertEquals

@KtorExperimentalAPI
class SolvenciaServiceTest {

    @Test
    fun testEvaluateSolvencia() = runBlocking {
        withTestApplication({
            application {
                routing {
                    post("/evaluate-solvencia") {
                        val operationId = call.receive<String>()
                        val result = SolvenciaService.evaluateSolvencia(operationId)
                        call.respondText(result)
                    }
                }
            })
        }) {
            val response = handleRequest(HttpMethod.Post, "/evaluate-solvencia") {
                addHeader("Content-Type", "application/json")
                setBody("{\"operationId\":\"12345\"}")
            }.response
            assertEquals("200", response.status().value.toString())
        }
    }
}