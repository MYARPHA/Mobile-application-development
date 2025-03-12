import kotlin.math.PI
import kotlin.random.Random

fun main() {
    println("Task 1")
    print("Введите число a: ")
    val a: Int = readLine()!!.toInt()

    print("Введите число b: ")
    val b: Int = readLine()!!.toInt()

    println("Сложение: $a+$b = ${a + b}")
    println("Вычитание: $a-$b = ${a - b}")
    println("Умножение: $a*$b = ${a * b}")

    if (b != 0)
    {
        println("Деление нацело: $a/$b = ${a / b}")
        println("Деление с остатком: $a%$b = ${a % b}")
    }
    else
    {
        println("Делить на 0 нельзя!!!")
    }

    println("Task 2")

    print("Введите ваше имя: ")
    val name: String = readLine().toString()

    print("Введите ваш рост: ")
    val height: Double = readLine()!!.toDouble()

    print("Введите ваш вес: ")
    val weight: Int = readLine()!!.toInt()

    val imt = weight / (height * height)

    println("$name, ваш ИМТ = %.2f".format(imt))

    println("Task 3")

    print("Введите количество секунд: ")
    val second: Int = readLine()!!.toInt()

    if (second == null || second < 0)
    {
        return println("Неккоректный ввод!")
    }
    val totalSecondsInDay = 86400
    val validSeconds = second % totalSecondsInDay // отбрасывание лишних секунд если число больше чем кол-во секунд в сутках

    val hours = validSeconds / 3600
    val minutes = (validSeconds % 3600) / 60
    val seconds = validSeconds % 60

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

    println("Task 4")
    print("Введите год: ")
    val year: Int = readLine()!!.toInt()

    if (year == null || year <= 0)
    {
        return println("Неккоректный ввод!")
    }
    val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    println(isLeapYear)

    println("Task 5")

    print("Введите число a1: ")
    val a1 = readLine()!!.toInt()

    print("Введите число b2: ")
    val b2 = readLine()!!.toInt()

    if (a1 > b2)
    {
        return println("Первое число должно быть меньше или равно второму")
    }
    val randomInt = Random.nextInt(a1, b2 + 1)
    val randomDouble = Random.nextDouble(a1.toDouble(), b2.toDouble())

    println("Случайное целое число от $a1 до $b2: $randomInt")
    println("Случайное вещественное число от $a1 до $b2: $randomDouble")

    println("Task 6")

    print("Введите внешний радиус: ")
    val outerRadius: Double = readLine()!!.toDouble()

    print("Введите внутренний радиус: ")
    val innerRadius = readLine()!!.toDouble()

    if (outerRadius <= innerRadius)
    {
        println("Внешний радиус должен быть больше внутреннего!!!!!!!!!1")
    }
    val area = PI * (outerRadius * outerRadius - innerRadius * innerRadius)

    println("Площадь кольца: %.3f".format(area))
}