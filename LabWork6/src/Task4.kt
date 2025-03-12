import java.lang.IllegalArgumentException

fun main() {
    val simpleFormula = getFormula("простые")
    val simpleAmount = simpleFormula(1000.0, 5.0, 3) // сумма 1000, процент 5, кол-во лет 3
    println("Сумма с простыми процентами: $simpleAmount")

    val compoundFormula = getFormula("сложные")
    val compoundAmount = compoundFormula(1000.0, 5.0, 3) // сумма 1000, процент 5, кол-во лет 3
    println("Сумма со сложными процентами: $compoundAmount")
}

fun getFormula(type: String): (Double, Double, Int) -> Double
{
        return when(type.lowercase())
        {
            "простые" -> {So, r, n -> So *( 1 + r/100 * n)}
            "сложные" -> {So, r, n -> So * Math.pow((1 + r / 100), n.toDouble())}
            else -> throw IllegalArgumentException()
        }
}
