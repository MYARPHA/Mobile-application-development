fun main() {
    println(absValue(-5.5))
    println(absValue(5.5))
    println(absValue(0.0))
}

fun absValue(number: Double): Double = if (number<0) -number else number //возвращает противоположное значение если оно отрицательно
