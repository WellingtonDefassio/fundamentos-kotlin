package io.wdefassio.fundamentos

fun main() {
    println(retornaNome("Caldimiro"))
    println(dizOi("Matheus"))
    println(dizOi("Matheus", 35))
    println(dizOi(idade = 33, nome = "Matheus"))}

fun retornaNome(nome: String): String {
    return "seu nome é $nome"
}

fun dizOi(nome: String, idade: Int = 20): String {
    return "oi, $nome de $idade anos"
}