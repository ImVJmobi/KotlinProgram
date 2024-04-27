package Kotlin_In




open class CompanionObject {

    companion object {
        var name= "Vijay"

        fun addValue() {
            println("My name is $name")
        }
    }
}


class testDate : CompanionObject(){
    var derivedValue = CompanionObject.addValue()

}

fun main(){

}
