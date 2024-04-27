package Class


//When a nested class is marked with a keyword inner, then it will be called as an Inner class.
//An inner class can be accessed by the data member of the outer class.


class InnerClass {

    var address : String = "GS Palaya"

    inner class Personal{

        fun add() = address
    }
}


fun main(){

    val obj = InnerClass().Personal()

    println(obj.add())

}