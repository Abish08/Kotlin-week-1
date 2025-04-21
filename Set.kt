package com.example.mc36a.ui.theme

class Set {
}
fun setExample() {
    val numbers = setOf(1, 2, 3, 4)

    for (element in numbers) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}
