package spice

fun main() {
    val spice = Spice()
    println("The spice name is ${spice.name} and degree of spiciness is ${spice.heat}")
}

class Spice {
    val name: String = "Curry"
    val spiciness: String = "Mild"
    val heat: Int
    get() {return 5}
}