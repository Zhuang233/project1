package com.example.myapplication


// open使得类可以被继承
open class Person{
    var name = ""
    var age = 0

    fun eat(){
        println(name + " is eating. he is "+ age +" year old.")
    }
}


fun main(){
    var p =  Person()
    p.name = "zbw"
    p.age = 21
    p.eat()
}