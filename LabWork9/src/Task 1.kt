fun main() {
    val colors = mutableListOf("Green", "Red", "Blue") // List<String>

    print("Сколько цветов добавить? : ")
    val n = readlnOrNull()?.toIntOrNull() ?: 0

    repeat(n) // ЭТО ЦИКЛ!
    {
        print("Введите цвет: ")
        val color = readlnOrNull()?.trim()

        if(!color.isNullOrEmpty())
        {
            colors.add(color)
        }else{
            println("Цвет не может быть пустым!")
        }
    }

    println("Список цветов: ")
    colors.forEachIndexed { index, color ->
        println("${index + 1} - $color")
    }
}


