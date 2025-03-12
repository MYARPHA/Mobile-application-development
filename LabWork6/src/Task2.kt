fun main() {
    println("Площадь квадрата со стороной 4: ${area(4.0)}")
    println("Площадь прямоуголника со сторонами 4 и 6: ${area(4.0, 6.0)}")
}
// площадь квадрата
fun area(side: Double):Double
{
    return side * side
}
// площадь прямоугольника
fun area(length: Double, width: Double):Double
{
    return length * width
}