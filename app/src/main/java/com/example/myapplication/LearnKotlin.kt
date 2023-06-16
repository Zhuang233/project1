package com.example.myapplication

import kotlin.math.max

fun main(){
    println("Hello Kotlin")
    // 变量学习
    var a:Int = 10
    val b = 50
    a = a * 10
    println("a = "+ a)
    println("the larger is " + TheLarger(a,b))
    println("the larger2 is " + TheLarger2(a,b))
    println("the larger3 is " + TheLarger3(a,b))
    Theif()
    println("zbw score is " + getScore("zbw"))
    println("sb score is " + getScore("sb"))
    println("aaa score is " + getScore("aaa"))
    thefor()
}

//函数学习
fun TheLarger(a:Int, b:Int):Int{
    return  max(a,b)
}

//单行函数定义语法糖
fun TheLarger2(a:Int, b:Int) = max(a,b)

// if的返回值
fun Theif(){
    val a = 15
    val b = 12
    val if_ret = if(a>b){
        a
    }
    else{
        b
    }

    println("the if return is " + if_ret)
}

//缝合上述用法
fun TheLarger3(a:Int,b:Int) = if(a>b) a else b


//when用法
fun getScore(name: String) = when(name){
    "zbw" -> 100
    "sb" -> 59
    else -> 0
}

//while循环无特殊性质

//for循环用法
fun thefor(){
    for(i in 0..5){
        println(i)
    }
    for (i in 0 until 5){
        println(i)
    }
    for (i in 10 downTo 6){
        println(i)
    }
    for (i in 0..7 step 2){
        println(i)
    }
}


