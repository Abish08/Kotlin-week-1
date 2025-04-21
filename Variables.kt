package com.example.mc36a

class Variables {
    init {
        // mutable
        // we can reassign values to mutable variables
        var age = 20
        age = 25

        // immutable
        // we can't reassign values to immutable variables
        val roll = 15
        // roll = 10 // ❌ This will cause an error

        var a: Boolean = true
        var b: Char = 'R'
        var c: Byte = 12
        var d: Short = 356
        var e: Int = 43543
        var f: Long = -51321354L
        var i: Float = 5.6461344f
        var h: Double = 7.32644564

        println(a)
        println(b)
        println(c)
        println(d)
        println(e)
        println(f)
        println(i)
        println(h)
    }
}
