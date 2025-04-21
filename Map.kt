package com.example.mc36a

class Map {
}
fun showCapitals() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )

    println("All keys   : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")
    println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")
}

fun studentMarksLookup() {
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45
    )

    print("Enter student name: ")
    val input = readln().lowercase()

    val marks = studentMarks[input]
    if (marks != null) {
        println("Marks of $input: $marks")
    } else {
        println("Student not found.")
    }
}
// Initialize a mutable map with student names and their marks
val studentMarks = mutableMapOf(
    "ram" to 45,
    "shyam" to 45,
    "hari" to 45,
    "gita" to 45
)

// Update the mark for "ram"
studentMarks["ram"] = 60

// Add a new student "sabin" with marks 80
studentMarks.put("sabin", 80)

// Prompt the user to enter a student's name
println("Enter student name:")
val input: String = readln().lowercase()

// Print the mark of the entered student name
println(studentMarks[input])