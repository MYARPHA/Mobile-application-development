fun main()
{
    println("Task 2")

    println("Таблица квадратов двузначных чисел")

    print(" ")
    for (units in 0..9) // диаппазон от 0 до 9 (единицы)
    {
        print("\t$units\t")
    }
    println()
    for (tens in 1..9) // цикл для десятков
    {
        print("$tens")

        for (units in 0..9)
        {
            val number = tens * 10 + units
            if (number > 1000)
                print(" ${number * number}")
            print(" ${number * number}\t")
        }
        println()
    }
}
