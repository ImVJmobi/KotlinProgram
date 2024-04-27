package org.example



fun main(args: Array<String>) {

    print("enter the vowels")
    var vowels : Char = readLine()!!.single()
    val vowelConsonant = if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') "vowel" else "consonant"
    println("$vowels is $vowelConsonant")
}