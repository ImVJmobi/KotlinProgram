package Class


//we cannot create objects of an abstract class.
//Abstract classes are always open. You do not need to explicitly use open keyword to inherit subclasses from them.



abstract class Persons(_personID: Int) {
    var _personID: Int
    abstract var age: Int

    // Initializer Block
    init {
        this._personID = _personID
    }

    abstract fun setPersonAge(_age:Int)
    abstract fun getPersonAge():Int

    fun getPersonID(){
        println("Name = $_personID")
    }
}




class Employee(_personID: Int): Persons(_personID) {
    override var age: Int = 0

    override fun setPersonAge(_age: Int) {
        age = _age
    }
    override fun getPersonAge():Int {
        return age
    }
}

fun main(args: Array<String>) {
    val employee = Employee(7465)
    var age : Int

    employee.setPersonAge(20)

    age = employee.getPersonAge()

    employee.getPersonID()
    println("Age = $age")

}