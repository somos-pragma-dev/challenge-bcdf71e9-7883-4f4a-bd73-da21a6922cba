package com.pragma.microservicio

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.github.resilience4j.retry.Retry
import io.github.resilience4j.retry.RetryConfig
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

object SolvenciaService {

    private val circuitBreaker = CircuitBreaker.ofDefaultConfig("creditBureauCircuitBreaker")
    private val retry = Retry.ofDefaultConfig("creditBureauRetry")
    private val client = HttpClient(CIO)

    suspend fun evaluateSolvencia(operationId: String): String = runBlocking {
        val response = circuitBreaker.decorateSupplier {
            retry.decorateSupplier {
                async {
                    client.get<String>("http://credit-bureau-service/credit-info/$operationId")
                }.await()
            }.get()
        }.get()
        return@runBlocking response
    }
}