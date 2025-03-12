fun main() {
    println("${average(1.0, 2.0, 3.0, 4.0, 5.0)}")
    println("${average(10.0, 20.0, 30.0, 40.0, 50.0)}")
    println("${average(89.0)}")
    println("${average()}")
}

fun average(vararg numbers: Double):Double // передайёт любое кол-во чисел
{
    if (numbers.isEmpty())
    {
        println("Не передано ни одного числа!")
        return 0.0
    }
    return numbers.sum() / numbers.size
}