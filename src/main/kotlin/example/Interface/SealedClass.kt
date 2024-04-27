package Interface

sealed class Sample {
    class A : Sample() {
        fun print()
        {
            println("This is the subclass A of sealed class Sample")
        }
    }
    class B : Sample() {
        fun print()
        {
            println("This is the subclass B of sealed class Sample")
        }
    }
}
fun main()
{
    val obj1 = Sample.B()
    obj1.print()

    val obj2 = Sample.A()
    obj2.print()
}
