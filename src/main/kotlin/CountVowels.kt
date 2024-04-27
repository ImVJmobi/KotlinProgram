package Excercise

fun main(){


    val str = " I Love Kotlin"
    print (conuntVowels(str))
}

fun conuntVowels(input : String): Int{

    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0

    for (i in input.lowercase()){
        if(i in vowels){
            count++
        }
    }

     return count

}