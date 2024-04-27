package Excercise

fun main() {
    val input = 'z'
    //val input = 'e'
    //val input = 'p'

    val character = input.lowercaseChar()

    if (character in listOf('a', 'e', 'i', 'o', 'u'))
    {
        println("The character '$input' is a vowel.")
    }
    else
    {
        println("The character '$input' is a consonant.")
    }
}