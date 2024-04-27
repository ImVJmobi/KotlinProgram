


// two types of break expression in Kotlin
// Unlabelled break is used to terminate to the closest enclosing loop when certain condition is satisfied.

//UNLABLED BREAK


//fun main(args: Array<String>) {
//    var sum = 0
//    var i = 1
//    while(i <= Int.MAX_VALUE) {
//        sum += i
//        i++
//        if(i == 10) {
//            break
//        }
//    }
//    print("The sum of integers from 1 to 10: $sum")
//}


//fun main(args: Array<String>) {
//    var names = arrayOf("Earth","Mars","Venus","Jupiter","Saturn","Uranus")
//    var i = 0
//
//    do{
//        println("The name of $i th planet: "+names[i])
//        if(names[i]=="Jupiter") {
//            break
//        }
//        i++
//    }while(i<=names.size)
//}



fun main(args: Array<String>) {

    var name = "GeeksforGeeks"
    for (i in name){
        print("$i")
        if(i == 'f') {
            break
        }
    }
}