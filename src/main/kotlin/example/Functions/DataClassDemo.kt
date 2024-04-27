package Kotlin_In
//
//fun main(args: Array<String>)
//{
//    //declaring a data class
//    data class man(val name: String)
//    {
//        //property declared in class body
//        var height: Int = 0;
//    }
//
//    //declaring a variable of the above data class and
//    //initializing values to all parameters
//
//    val man1=man("manish")
//    //class body properties must be assigned uniquely
//    man1.height = 70
//
//    //this method prints the details of class that
//    //are declared in primary constructor
//    println(man1.toString());
//
//    //printing the height of man1
//    println(man1.height.toString());
//}
//
//
//
//
//



//Copy

fun main(args: Array<String>)
{
    //declaring a data class
    data class man(val name: String, val age: Int)
    {
        //property declared in class body
        var height: Int = 0;
    }

    val man1 = man("manish",18)
//
//    //copying details of man1 with change in name of man
    val man2 = man1.copy(age=100)
//
//    //copying all details of man1 to man3
//    val man3 = man1.copy();
//
//    //declaring heights of individual men
    man1.height=100
//    man2.height=90
//    man3.height=110

    //man1 & man3 have different class body values,
    //but same parameter values

    //printing info all 3 men
    println("${man1} has ${man1.height} cm height")
    println("${man2} has ${man2.height} cm height")
//    println("${man3} has ${man3.height} cm height")

}
