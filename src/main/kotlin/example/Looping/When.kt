
fun main() {

    var animal = "cat"
    var action: String

    when (animal) {
        "cat" -> {
            action = "pet it"
        }

        "dog" -> {
            action = "feed it"
        }

        else ->
            action = "google it"
    }

print(action)
}