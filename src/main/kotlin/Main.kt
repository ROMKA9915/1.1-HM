package ru.netology

fun main() {
    val amount = 5000
    val comission = 0.75
    val minimalComission = 35
    val resultComission = (amount * comission)/100

    if(resultComission > minimalComission){
        println(resultComission)
    } else{
        println(minimalComission)
    }
}