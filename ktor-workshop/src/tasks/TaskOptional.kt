package com.example.tasks

import com.example.ImageData
import com.example.gson_pretty
import io.ktor.application.call
import io.ktor.http.Parameters
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.delete
import io.ktor.routing.get
import io.ktor.routing.post
import java.io.File

private val images_taskOptional: MutableList<ImageData> = mutableListOf(
    ImageData(1, "Chrysanthemum.jpg", "images/taskOptional/Chrysanthemum.jpg"),
    ImageData(2, "Desert.jpg", "images/taskOptional/Desert.jpg"),
    ImageData(3, "Hydrangeas.jpg", "images/taskOptional/Hydrangeas.jpg"),
    ImageData(4, "Jellyfish.jpg", "images/taskOptional/Jellyfish.jpg"),
    ImageData(5, "Koala.jpg", "images/taskOptional/Koala.jpg"),
    ImageData(6, "Penguins.jpg", "images/taskOptional/Penguins.jpg"),
    ImageData(7, "Tulips.jpg", "images/taskOptional/Tulips.jpg")
)

fun Routing.routesTaskOptional() {

    // Aufgabe 4 (Optional)

}

