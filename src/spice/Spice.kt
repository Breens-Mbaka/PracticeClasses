package spice

fun main() {
    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
}

val spices1 = listOf(
Spice("curry", "mild"),
Spice("pepper", "medium"),
Spice("cayenne", "spicy"),
Spice("ginger", "mild"),
Spice("red curry", "medium"),
Spice("green curry", "mild"),
Spice("hot pepper", "extremely spicy")
)

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