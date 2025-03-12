fun main() {
    print("Введите сумму покупки: ")
    val purchaseAmount = readln().toDouble()

    var totalPaid = 0.0
    do
    {
        print("Введите внесённую сумму: ")
        val paidAmount = readln().toDoubleOrNull()

        if (paidAmount == null || paidAmount <= 0)
        {
            println("Ошибка! Введите положительное число")
            continue
        }
        totalPaid +=paidAmount

        if (totalPaid < purchaseAmount)
        {
            val shortage = purchaseAmount - totalPaid
            println("Недостаточно средств! Сумма доплаты: $shortage")
        }
    } while (totalPaid < purchaseAmount)  // цикл с постусловием (повтор пока не введена достаточная сумма для оплаты)

    val change = totalPaid - purchaseAmount

    if (change == 0.0) {
        println("Спасибо!")
    } else {
        println("Возьмите сдачу: $change")
    }
}