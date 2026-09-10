package com.pragma.microservicio

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

object CreditBureauClient {

    private val client = HttpClient(CIO)

    suspend fun getCreditInfo(operationId: String): String = client.get("http://credit-bureau-service/credit-info/$operationId").bodyAsText()
}