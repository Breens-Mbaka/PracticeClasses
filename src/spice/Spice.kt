package spice

fun main() {
    val spice = Spice("Curry", spiciness = "Hot")
    println("The ${spice.name} its ${spice.spiciness} and its level of spiceness is ${spice.heat}")
}


class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
    get() {
        return when (spiciness) {
            "Flat" -> 2
            "Mild" -> 5
            "Hot" -> 8
            "Very hot" -> 10
            "Extra hot" -> 12
            else -> 0
        }
    }
}