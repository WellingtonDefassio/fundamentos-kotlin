package io.wdefassio.fundamentos

fun parOrImpar(number: Int) {
    if(number % 2 == 0) {
        println("Par")
    } else {
        println("Impar")
    }
}

fun main() {
    parOrImpar(5)
    parOrImpar(2)
    parOrImpar(8)
    parOrImpar(3)
    parOrImpar(7)
}