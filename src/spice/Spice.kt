package spice

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String,spiciness: String,color: SpiceColor = YellowSpiceColor): Spice(name, spiciness,color), Grinder {
    override fun grind() {
        println("Curry is made of mixtures which are grind")
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor: SpiceColor{
    override val color: String
        get() = "Yellow"
}