package com.example.mc36a

class user defined functions {
}
// Function to display the entered numbers
fun show(a: Int, b: Int): Unit {
    println("You entered $a and $b")
}

// Function to calculate the sum of two numbers
fun add(a: Int, b: Int): Int {
    var sum = 0
    sum = a + b
    return sum
}

// Function to find the minimum of two numbers
fun findMinimumNumber(a: Int, b: Int): Int {
    var minimum = 0
    if (a > b) {
        minimum = b
    } else {
        minimum = a
    }
    return minimum
}

// Main program logic
fun main() {
    // Prompt user to enter the first number
    println("Enter first number: ")
    val a: Int = readln().toInt()

    // Prompt user to enter the second number
    println("Enter second number: ")
    val b: Int = readln().toInt()

    // Display the entered numbers
    show(a, b)

    // Calculate the sum of the two numbers
    val sum = add(a, b)
    println("Sum of the two entered numbers is $sum")

    // Find the minimum of the two numbers
    val minimum = findMinimumNumber(a, b)
    println("And the smallest between $a and $b is $minimum")
}