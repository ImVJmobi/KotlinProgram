package org.example.scope_function





//    Function	     Object Reference	                   Return Value
//       let	           it	  (identifier)             Lambda result
//      with	           this	                           Lambda result
//       run	           this	                           Lambda result
//       apply	           this	                           Context object
//       also	           it	   (identifier)            Context object


class runFunction(){

    var name: String ="Vijay"
    var age : Int = 10

}

fun main(){
    val student = runFunction()
    val returnResult = student.run{
        age =200
        println(name)
        println(this.age)
        "Hi I am Ninja and I love Coding Ninjas"
    }
    println(returnResult)


}