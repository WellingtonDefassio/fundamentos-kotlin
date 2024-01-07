package io.wdefassio.fundamentos

fun main() {
    val intList = mutableListOf(1, 2, 3, 4, 5, 6)

    val filteredList = intList.filter { it != 2 }

    intList.forEach {
        println(it + 1000)
    }

    println(filteredList)

    intList.add(8)
    intList.remove(0)

}