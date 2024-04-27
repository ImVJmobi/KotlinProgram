package Class

//Every Kotlin class needs to have a constructor and if we do not define it, then the compiler generates a default constructor.
//an object is created, the defined constructor is called automatically which is used to initialize the properties of the class.

//Primary Constructor
//The primary constructor can be declared at class header level

//The constructor keyword can be omitted if there is no annotations or access modifiers

//The primary constructor cannot contain any code.
//Initialization code can be placed in initializer blocks prefixed with the init keyword.
//There could be more than one init blocks and during the initialization of an instance, the initializer blocks are executed in the same order as they appear in the class body.
//Kotlin allows to initialize the constructor parameters with some default values.



//
//class Person constructor(val _name: String, val _age: Int = 50) {
//    // Member Variables
//    var name: String
//    var age: Int
//
//    // Initializer Block
//    init {
//        this.name = _name
//        this.age = _age
//        println("Name = $name")
//        println("Age = $age")
//    }
//}
//
//fun main(args: Array<String>) {
//    val person = Person("Zara")
//}





//Second Constructors

//allows to create one or more secondary constructors for your class.
// This secondary constructor is created using the constructor keyword.
//you want to create more than one constructor in Kotlin or whenever you want to include more logic in the primary constructor .
//you cannot do that because the primary constructor may be called by some other class.

class Person{
    // Member Variables
    var name: String
    var age: Int
    var city: String
    var zip: Int

    // Initializer Block
    init {
        println("Initializer Block")
    }

    // Secondary Constructor
    constructor ( _name: String, _age: Int) {
        this.name = _name
        this.age = _age
        this.city = ""
        this.zip = 0
        println("Name = $name")
        println("Age = $age")
    }

    // Secondary Constructor
    constructor ( _name: String, _age: Int,_city: String, _zip: Int) {
        this.name = _name
        this.age = _age
        this.city = _city
        this.zip = _zip
        println("Name = $name")
        println("Age = $age")
        println("City = $city")
        println("Zip = $zip")
    }
}

fun main(args: Array<String>) {
    val zara = Person("Zara", 20)
    val zara1 = Person("Zara", 20, _city = "KA", _zip = 560100)
}