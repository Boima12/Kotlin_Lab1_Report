package org.example

fun main() {
    val a = 10
    val b = 3
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    val num: Int = 42
    val decimal: Double = num.toDouble()

    var muVar = 5
    val immuVar = 10
    muVar += 1
    println(muVar)
    println(immuVar)


    if (muVar > immuVar) {
        println("greater")
    } else {
        println("greater or equal")
    }

    for (i in 1..5) {
        print("$i ")
    }
    println()


    val myList = listOf("Apple", "Banana", "Cherry")
    val myArray = arrayOf(1, 2, 3, 4, 5)

    println(myList)
    println(myArray.joinToString(", "))


    var null1: String? = "not null"
    println(null1?.length)
    null1 = null
    println(null1?.length ?: "Null value")
}
