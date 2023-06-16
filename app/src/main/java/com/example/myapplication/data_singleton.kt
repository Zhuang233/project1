package com.example.myapplication

//数据类（自动加tostring,hashcode,equals,可不加{}）
data class car(val color:String,val value : Int)

//单例（直接使用，自动创建实例）
object car2 {
    fun p() = println("singleton")
}

fun main(){
    var c = car("红",21000)
    println(c.color)
    println(c.value)
    car2.p()
}