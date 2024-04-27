package Functions


//default arguments…
//The arguments which need not specify explicitly while calling a function are called default arguments.

//
//fun main( ) {
//    firstName()
//}
//
//fun firstName(name : String = "Vijay"){
//var surname = "Panchanathn"
//println( "$name $surname")
//}



fun student(name: String="Praveen", standard: String="IX" , roll_no: Int=11) {
    println("Name of the student is: $name")
    println("Standard of the student is: $standard")
    println("Roll no of the student is: $roll_no")
}
fun main(args: Array<String>) {
    val name_of_student = "Gaurav"
    val standard_of_student = "VIII"
    val roll_no_of_student = 25
 //   student()         // passing no arguments while calling student
    student(name_of_student,standard_of_student) // passing only two arguments name and standard of student
}