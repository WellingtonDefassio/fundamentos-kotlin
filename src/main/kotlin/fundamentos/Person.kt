package io.wdefassio.fundamentos

class Person(var name: String, var age: Int) {
    override fun toString(): String {
        return "Class: Person, name:${name}, age:${age}"
    }
}

fun main() {
    var person = Person("Gustavo", 32);
    println(person)
}