package io.wdefassio.fundamentos

class Car(var color: String, val ageOfFabrication: Int, val owner: Owner){

}

class Owner(val name: String,val age: Int){
    override fun toString(): String {
        return "name:$name, age:$age"
    }
}

fun main() {
    var owner = Owner("Mario", 22)

    var car = Car("White", 2021, owner)

    println(car.color)
    car.color = "Black"
    println(car.color)

    println(car.owner)
}