# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Sistema distribuido con Kotlin, Ktor, circuit breakers y observabilidad

### Reto
- Tema: Microservicios con Kotlin
- Seniority: junior-l1
- Tipo: mixed
- Título: Diseño y desarrollo de un microservicio en un sistema distribuido
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición del dominio y requisitos — objetivo: Establecer claramente los requisitos del microservicio y las restricciones del dominio. — entregable (NO resolver): Documento que describe los requisitos del microservicio y las restricciones del dominio.
- Fase 2: Diseño del microservicio — objetivo: Diseñar la arquitectura del microservicio, incluyendo la elección de tecnologías y patrones de diseño. — entregable (NO resolver): Documento que describe la arquitectura del microservicio y las tecnologías elegidas.
- Fase 3: Implementación del microservicio — objetivo: Implementar el microservicio siguiendo el diseño establecido. — entregable (NO resolver): Código fuente del microservicio implementado y pruebas asociadas.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: src/main/kotlin/com/pragma/microservicio/Application.kt ===
package com.pragma.microservicio

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import com.pragma.microservicio.SolvenciaController

fun main() {
    embeddedServer(Netty, port = 8080) {
        module()
    }.start(wait = true)
}

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Microservicio de Evaluación de Solvencia")
        }
        SolvenciaController.registerRoutes(this)
    }
}

// === ARCHIVO: src/main/resources/application.conf ===
ktor {
    deployment {
        port = 8080
    }
    application {
        modules = [ com.pragma.microservicio.ApplicationKt.module ]
    }
}

// === ARCHIVO: src/main/kotlin/com/pragma/microservicio/SolvenciaService.kt ===
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

// === ARCHIVO: src/main/kotlin/com/pragma/microservicio/CreditBureauClient.kt ===
package com.pragma.microservicio

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

object CreditBureauClient {

    private val client = HttpClient(CIO)

    suspend fun getCreditInfo(operationId: String): String = client.get("http://credit-bureau-service/credit-info/$operationId").bodyAsText()
}

// === ARCHIVO: src/main/kotlin/com/pragma/microservicio/SolvenciaController.kt ===
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

// === ARCHIVO: src/test/kotlin/com/pragma/microservicio/SolvenciaServiceTest.kt ===
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

// === ARCHIVO: src/main/kotlin/com/pragma/microservicio/ResilienceConfig.kt ===
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

```
