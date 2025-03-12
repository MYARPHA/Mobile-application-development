fun main() {
    print("Введите число a: ")
    val a = readln().toDoubleOrNull() ?: return print("Ошибка! Введите число заново: ")

    var b: Double? = null
    while (b == null || b == 0.0)
    {
        print("Введите число b( не равное 0): ")
        b = readln().toDoubleOrNull()

        if (b == null )
        {
            println("Ошибка! Введите число: ")
        }
        else if (b == 0.0)
        {
            println("На ноль делить нельзя!")
        }
    }
    val result = a/b
    println("Результат деления: $a / $b = $result")

}