fun main() {
    println("Task 1")

    print("Введите шаг для изменения температуры (Цельсия): ")
    val step = readln().toInt()

    println("Температура по шкалам Цельсия и Фаренгейта")
    println("------------------------------------------")
    println("    Цельсий | Фаренгейт")
    println("------------------------------------------")

    for (celsius in 100 downTo -50 step step) //downTo - диапазон в обратном порядке
    {
        val fahrenheit = celsius * 1.8 + 32
        println("   %4d     |   %.1f".format(celsius, fahrenheit)) //%4d -минимальная ширина ввода
    }
}