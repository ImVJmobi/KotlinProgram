package org.example.scope_function



//    Function	     Object Reference	                   Return Value
//       let	           it	  (identifier)             Lambda result
//      with	           this	                           Lambda result
//       run	           this	                           Lambda result
//       apply	           this	                           Context object
//       also	           it	   (identifier)            Context object


fun letFunction(){

 var name: String ="Vijay"
    var age : Int = 10

    name?.let {

        println(name)
        println(it.reversed())
    }

    age?.let {
        age = 20
        println(it)

    }


}

fun main(){
    letFunction()
}