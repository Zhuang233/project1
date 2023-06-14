package com.example.myapplication


// open使得类可以被继承
//()里是主构造函数，无函数体
open class Person(val name : String, val age : Int){
    fun eat(){
        println(name + " is eating. he is "+ age +" year old.")
    }
}

class Student(val sex:String,name: String,age: Int):Person(name,age){
    // 主构造函数体
    init{
        println(name + " gender is" + sex)
    }

    // 次构造函数
    constructor():this("??","无名氏",0)
    constructor(name: String,age: Int):this("??",name,age)

}

fun main(){
    var p =  Person("zbw",21)
    p.eat()
    var s = Student("女","lcx",21)
    s.eat()
    var s2 = Student()
    s2.eat()
    var s3 = Student("赫敏",16)
    s3.eat()
}