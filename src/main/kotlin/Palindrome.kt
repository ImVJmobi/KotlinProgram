package org.example

import java.security.Principal

fun main(){

    print("Please enter name ")

    val name = readLine()

    if (name != null) {
        if (name == name.reversed()){
    println(" It is Palindrome ")
        }
        else
            println(" It isn't Palindrome ")
    }
}