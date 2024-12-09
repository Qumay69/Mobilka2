fun main() {
    print("Введите длинну стороны шестиугольника: ")
    var a = readLine()!!.toDouble() // Задайте длину стороны шестиугольника
    var hexagonArea = calculateHexagonArea(a)
    println("Площадь правильного шестиугольника со стороной $a равна $hexagonArea")
}

fun calculateTriangleArea(a: Double): Double {
    // Площадь равностороннего треугольника: (sqrt(3) *(a^2)) / 4
    return (Math.sqrt(3.0) * (a * a))/ 4
}

fun calculateHexagonArea(a: Double): Double {
    // Площадь правильного шестиугольника равна площади шести равносторонних треугольников
    return 6 * calculateTriangleArea(a)
}