package String

//An array of characters is called a string. Kotlin strings are mostly similar to Java strings but have some newly added
//functionalities. Kotlin strings are also immutable in nature means we can not change the elements and length of the String.


//To declare a string in Kotlin, we need to use double quotes(” “), single quotes are not allowed to define Strings.
//var variable_name = "Hello, Geeks"
//or
//var variable_name : String = "GeeksforGeeks"






//To create an empty string in Kotlin, we need to create an instance of the String class.

//var variable_name = String()



//fun main(args: Array<String>){
//    // accessing string
//    // elements one by one
//    var str = "Hello"
//    println(str[0])
//    println(str[1])
//    println(str[2])
//    println(str[3])
//    println(str[4])
//    // accessing the string
//    // elements using for loop
//    var str2 = "Geeks"
//    for(i in str2.indices){
//        print(str2[i]+" ")
//    }
//}



// Escaped string is declared within double quote (" ") and may contain escape characters like '\n', '\t', '\b' etc.

// Raw string is declared within triple quote (""" """) and may contain multiple lines of text without any escape characters.
//fun main(args: Array<String>) {
//    val escapedString : String  = "I am escaped String!\n"
//    var rawString :String  = """This is going to be a
//   multi-line string and will
//   not have any escape sequence""";
//
//    print(escapedString)
//    println(rawString)
//}




// Kotlin string templates are pieces of code that are evaluated and whose results are interpolated into the string.
// A template expression starts with a dollar sign ($) and may consist of either a name or an expression.

//fun main(args: Array<String>) {
//    val name : String = "Zara Ali"
//
//    println("Name  - $name")  // Using template with variable name
//
//    println("Name length - ${name.length}")  // Using template with expression.
//}


//Kotlin getOrNull() function returns a character at the given index or null if the index is out of bounds of this char sequence.

fun main(args: Array<String>) {
    var name : String = "Zara"

    println(name.getOrNull(0))
    println(name.getOrNull(2))
    println(name.getOrNull(100))
}