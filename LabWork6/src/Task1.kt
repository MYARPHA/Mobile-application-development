fun main() {
    println(arithmeticProgression(5))
    println(arithmeticProgression(5, firstTerm = 2))
    println(arithmeticProgression(5, step = 3))
    println(arithmeticProgression(5, 2,3))
}
fun arithmeticProgression(n: Int, firstTerm: Int = 0, step: Int = 1): Int //firstTerm - необязательный аргумент(по умолч 0), step - шаг прогрессии(по умолч 1)
{
    return firstTerm + (n - 1) * step
}