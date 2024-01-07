package io.wdefassio.fundamentos

fun main() {
    val x = 10

    when(x) {
        5 -> println("x == 5")
        8 -> println("x == 8")
        10 -> println("x == 10")
        else -> println("numero não mapeado")
    }
}