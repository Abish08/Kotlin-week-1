package com.example.mc36a.ui.theme

class Operator Precedence {
// BODMAS Example: Operator precedence
    var result: Int = 5 + 2 * 4
    println("Result of 5 + 2 * 4 = $result") // Multiplication has higher precedence

    result = (5 + 2) * 4
    println("Result of (5 + 2) * 4 = $result") // Parentheses override precedence

// Complex expression with unary and decrement operators
    var x: Int = 8
    var y: Int = 4
    var z: Int = 2
    var sum: Int = 0
    sum = x + -y + --z
    println("x + -y + --z :: $sum")

// Range Function and 'in' Operator
    var myCharRange = 'a'.rangeTo('j') // Create a range from 'a' to 'j'
    var testCharRange = 'a'..'j'       // Alternative syntax for range creation

// Check if 'Z' is in the range
    var check = 'Z' in testCharRange
    println("myCharRange has Z : $check")

// Print the ranges
    println("myCharRange: $myCharRange")
    println("testCharRange: $testCharRange")}