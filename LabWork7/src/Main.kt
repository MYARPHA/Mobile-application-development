import kotlin.math.min

fun main() {
    println("Task 1")
    val city = City("Москва", "Россия", 2561.5, 13149803)
    println(city)

    println()

    println("Task 2")
    // первичный конструктор
    val cityFirst = City("Лондон")
    cityFirst.country = "Великобритания"
    cityFirst.area = 229.946
    cityFirst.population = 65121000
    println(cityFirst)

    // вторичный конструктор
    val citySecond = City("Сеул", "Южная Корея", 100.363, 51751065)
    println(citySecond)

    // Task 3
    println()
    println("Task 3")
    city.printInfo()
    cityFirst.printInfo()
    citySecond.printInfo()
    println()
    println("Комментарий: ${city.lastParamComment}")

    println()

    println("Task 4")
    city.name = ""
    city.country = ""
    city.area = -500.0
    city.population = -5000

    // Task 5
    val cities = arrayOf(
        City("Сеул", "Южная Корея", 100.363, 51751065),
        City("Москва", "Россия", 2561.5, 13149803),
        City("Токио", "Япония", 2194.07, 13960000)
    )
    println("Информация о городах: ")
    cities.forEach{it.printInfo()}
    println()

    val minArea = 2000.0
    println("Города с площадью больше $minArea км^2: ")
    cities.filter { it.area > minArea }.forEach{it.printInfo()}
}