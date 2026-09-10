package com.pragma.microservicio

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.github.resilience4j.retry.RetryConfig

object ResilienceConfig {

    val circuitBreakerConfig = CircuitBreakerConfig.custom()
       .failureRateThreshold(50)
       .waitDurationInOpenState(30000)
       .build()

    val retryConfig = RetryConfig.custom<Any>()
       .maxAttempts(3)
       .build()
}