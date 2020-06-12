package com.example

import com.example.tasks.routesTask1
import com.example.tasks.routesTask2
import com.example.tasks.routesTask3
import com.example.tasks.routesTaskOptional
import com.google.gson.GsonBuilder
import io.ktor.application.*
import io.ktor.features.CORS
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpMethod
import io.ktor.http.content.files
import io.ktor.http.content.static
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.delete
import io.ktor.routing.get
import io.ktor.routing.routing
import java.io.File

val gson_pretty = GsonBuilder().setPrettyPrinting().create()

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module(testing: Boolean = false) {
    install(CORS) {
        method(HttpMethod.Options)
        method(HttpMethod.Get)
        method(HttpMethod.Delete)
        method(HttpMethod.Post)
        header(HttpHeaders.AccessControlAllowHeaders)
        header(HttpHeaders.ContentType)
        header(HttpHeaders.AccessControlAllowOrigin)
        allowCredentials = true
        anyHost()
    }
    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
        }
    }

    routing {
        static("images") {
            files("images")
        }
        routesTask1()
        routesTask2()
        routesTask3()
        routesTaskOptional()
        delete("/image/reset") {
            File("images/task2").deleteRecursively()
            File("images/taskOptional").deleteRecursively()
            File("images/task1").copyRecursively(File("images/task2"))
            File("images/task1").copyRecursively(File("images/taskOptional"))
            call.respond(200)
        }
        get("/checkStatus"){
            call.respond(200)
        }
    }
}

