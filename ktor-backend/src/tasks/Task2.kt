package com.example.tasks

import com.example.ImageData
import com.example.gson_pretty
import io.ktor.application.call
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.post
import java.io.File

private val images_task2: List<ImageData> = listOf(
    ImageData(1, "Chrysanthemum.jpg", "images/task2/Chrysanthemum.jpg"),
    ImageData(2, "Desert.jpg", "images/task2/Desert.jpg"),
    ImageData(3, "Hydrangeas.jpg", "images/task2/Hydrangeas.jpg"),
    ImageData(4, "Jellyfish.jpg", "images/task2/Jellyfish.jpg"),
    ImageData(5, "Koala.jpg", "images/task2/Koala.jpg"),
    ImageData(6, "Penguins.jpg", "images/task2/Penguins.jpg"),
    ImageData(7, "Tulips.jpg", "images/task2/Tulips.jpg")
)

fun Routing.routesTask2() {

    // Aufgabe 2

}
