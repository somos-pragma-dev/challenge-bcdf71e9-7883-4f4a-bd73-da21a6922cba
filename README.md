# Diseño y desarrollo de un microservicio en un sistema distribuido

En el contexto de un sistema de gestión de préstamos bancarios, necesitas diseñar y desarrollar un microservicio que se encargue de la evaluación de la solvencia de los solicitantes de préstamos. Este microservicio recibirá solicitudes de préstamos desde el frontend, consultará el buró de crédito para obtener información financiera del solicitante y, basándose en esa información, determinará si el solicitante es apto para recibir un préstamo. El microservicio debe manejar un volumen de 1 500 solicitudes por segundo en hora pico y garantizar una respuesta en menos de 2 segundos. Debe ser idempotente con respecto al número de operación y soportar reintentos en caso de fallos temporales del buró de crédito.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Microservicios con Kotlin |
| **Nivel** | junior-l1 |
| **Tipo** | mixed |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del dominio y requisitos

**Objetivo:** Establecer claramente los requisitos del microservicio y las restricciones del dominio.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica los actores y las interacciones clave en el dominio de la evaluación de solvencia.
- Establece los criterios de aceptación para el microservicio, incluyendo umbrales de tiempo de respuesta y volumen de solicitudes.

**Entregable:** Documento que describe los requisitos del microservicio y las restricciones del dominio.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las posibles fuentes de información y los sumideros de datos en el dominio.
- Piensa en los posibles modos de falla y cómo el microservicio debe manejarlos.

</details>

### Fase 2: Diseño del microservicio

**Objetivo:** Diseñar la arquitectura del microservicio, incluyendo la elección de tecnologías y patrones de diseño.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Elige las tecnologías y los patrones de diseño que mejor se ajusten a los requisitos del microservicio.
- Diseña la arquitectura del microservicio, incluyendo los componentes principales y las interacciones entre ellos.

**Entregable:** Documento que describe la arquitectura del microservicio y las tecnologías elegidas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la necesidad de idempotencia y reintentos en el diseño del microservicio.
- Piensa en cómo manejar los posibles fallos del buró de crédito.

</details>

### Fase 3: Implementación del microservicio

**Objetivo:** Implementar el microservicio siguiendo el diseño establecido.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa los componentes del microservicio siguiendo el diseño establecido.
- Realiza pruebas unitarias y de integración para verificar el funcionamiento del microservicio.

**Entregable:** Código fuente del microservicio implementado y pruebas asociadas.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza técnicas de programación defensiva para manejar posibles errores y excepciones.
- Asegúrate de que el microservicio cumpla con los criterios de aceptación establecidos en la fase 1.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un microservicio y cuáles son sus características principales?
- **paraQueSirve**: ¿Para qué sirve el microservicio de evaluación de solvencia en el sistema de gestión de préstamos bancarios?
- **comoSeUsa**: ¿Cómo se usa el microservicio de evaluación de solvencia para determinar la solvencia de un solicitante de préstamo?
- **erroresComunes**: ¿Cuáles son los errores comunes que puede encontrar el microservicio de evaluación de solvencia y cómo se pueden manejar?
- **queDecisionesImplica**: ¿Qué decisiones de diseño implica el desarrollo del microservicio de evaluación de solvencia?

## Criterios de Evaluacion

- Definición clara de los requisitos del microservicio y las restricciones del dominio.
- Diseño adecuado de la arquitectura del microservicio, incluyendo la elección de tecnologías y patrones de diseño.
- Implementación correcta del microservicio siguiendo el diseño establecido.
- Cumplimiento de los criterios de aceptación establecidos en la fase 1.
- Manejo adecuado de errores y excepciones en el microservicio.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
