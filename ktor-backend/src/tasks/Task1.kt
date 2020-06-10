package com.example.tasks

import com.example.ImageData
import com.example.gson_pretty
import io.ktor.application.call
import io.ktor.http.Parameters
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get

private val images_task1: List<ImageData> = listOf(
    ImageData(1, "Chrysanthemum.jpg", "images/task1/Chrysanthemum.jpg"),
    ImageData(2, "Desert.jpg", "images/task1/Desert.jpg"),
    ImageData(3, "Hydrangeas.jpg", "images/task1/Hydrangeas.jpg"),
    ImageData(4, "Jellyfish.jpg", "images/task1/Jellyfish.jpg"),
    ImageData(5, "Koala.jpg", "images/task1/Koala.jpg"),
    ImageData(6, "Penguins.jpg", "images/task1/Penguins.jpg"),
    ImageData(7, "Tulips.jpg", "images/task1/Tulips.jpg")
)

fun Routing.routesTask1() {

    //Aufgabe 1

}


