fun currentTemperature (morningTemperature: Int, afternoonTemperature: Int): Int {
    return (morningTemperature + afternoonTemperature) / 2
}

fun main() {
    val averageTemp = currentTemperature(25, 40)
    println("Average temperature for the day: $averageTemp°C")
}