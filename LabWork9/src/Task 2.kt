fun main() {
    print("Введите кол-во элементов: ")
    val n = readLine()?.toIntOrNull() ?: return
    val numbers = mutableListOf<Int>()

    for (i in 1..n)
    {
        print("Введите число $i: ")
        val num = readLine()?.toIntOrNull() ?: 0
        numbers.add(num)
    }

    val index100 = numbers.indexOf(100) // индекс элемента = 100
    println("Индекс элемента равного 100: ${if (index100 != -1) index100 + 1 else "НЕ НАЙДЕН!"}")

    val sum = numbers.sum() // сумма элементов
    println("Сумма элементов: $sum")

    val average = numbers.average() // среднее значение
    println("Среднее значение: $average")

    val allPositive = numbers.all {it > 0} // все числа > 0
    println("Все числа больше нуля: $allPositive")

    val oddNumbers = numbers.filter { it % 2 !=0 } // все нечётные
    println("Все нечётные числа: $oddNumbers")
}

