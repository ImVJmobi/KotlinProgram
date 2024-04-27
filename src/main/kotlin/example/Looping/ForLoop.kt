//Executes a block of code for each element in an iterator
//Collections
// Range 1..5

fun main(){


//Collection
     var animals = listOf("Dog","Goat","Bull","Elephant","Horse")
     for( animal in animals){
         println("Feeding the $animal")
     }

    //Range can be ascending
    for (i in 1 ..3){
        print("you're out $i")
    }

    //Range can be desending
    for (i in 10 downTo 1){
        println("you're out $i")
    }


    //Range can be desending and skiped element
    for (i in 10 downTo 1 step 3) {
        println("you're out $i")
    }


    //Inside for Loop
    for (i in 10 downTo 1 step 3) {
        for (j in 10 downTo 1 step 3) {
            println("$i , $j \t")
        }
    }

 }