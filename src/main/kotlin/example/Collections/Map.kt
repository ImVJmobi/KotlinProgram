

//A map is a set of key-value pairs
// Keys are unique and values can be duplicate

fun main() {

    var student = mapOf(1 to "one", 2 to "two", 3 to "three", 3 to "four")
    var translation = mapOf( "one" to "un" , "two" to "deux" , "three" to "troix")

    println(student)

    // Get the value based on a key
    println(student.get(3))

    //Get whole set of keys (Unique)
    println(translation.keys)

    //Get whole set of values (Unique)
    println(translation.values)
}