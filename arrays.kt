package com.example.mc36a

import java.util.jar.Attributes.Name

class arrays {
    fun main(arrays: Array<String>) {
        var age = arrayOf(1, 2, 3)
        println(age.contentToString())
        println("The first element of age is " + age[0])
        println("The second element of age is " + age[1])
        println("The Third element of age is " + age[2])

        println("**********************************")

        var Name  = arrayOf("SHUBAM", "SIDDHU", "YAUSHAN")
        Name[1] = "sandesh"
        println("the first element of name is " + Name[0])
        println("the second element of name is " + Name[1])
        println("the third element of name is " + Name[2])

        println(Name.size)

        var age1 = ArrayList<Int>()
        age1.add(1)
        age1.add(1, 20)
        age1.add(5)

        var age2 = arrayListOf<Int>(1, 20, 5)
        var Name = arrayListOf<String>("Sandesh", "SHUBAM", "SIDDHU")
        Name.add("YASUHAN")
        Name.add(4, "Sita")

        Name.remove("Shyam")
        Name.removeAt(0)
        println(Name)

        var mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
        println(mixArrayList[0])
        println(mixArrayList[1])
        println(mixArrayList[2])
    }
}
