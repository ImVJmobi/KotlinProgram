package Functions

//A user-defined function can take zero or more parameters. Parameters are options and can be used based on requirement.
//Unit-returning Functions
//If a function does not return a useful value, its return type is Unit. Unit is a type with only one value which is Unit.


//fun main(){
//
//    var a = 20
//    var b = 30
//    addtionCal(a,b)
//}
//
//
//fun addtionCal(a :Int, b :Int) : unit{
//
//    println(a+b)
//
//}


//Return Values
//A kotlin function return a value based on requirement. Again it is very much optional to return a value.
//To return a value, use the return keyword, and specify the return type after the function's parantheses


fun main(){

    var a = 20
    var b = 30
    var result = addtionCal(a,b)
    print(result)
}


fun addtionCal(a :Int, b :Int ): Int{
var add = a+b
    println(add)
return add
}


