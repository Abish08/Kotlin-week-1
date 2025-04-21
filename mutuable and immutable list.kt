package com.example.mc36a.ui.theme

class mutuable and Immutable list {
}
fun main() {
    // Immutable List
    val lst = listOf("one", "two", "three")
    println("Immutable List")
    for (i in lst.indices) {
        println(lst[i])
    }

    println()

    // Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("four")
    println("Mutable List")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
    }
}
