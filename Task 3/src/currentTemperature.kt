fun main() {
    currentTemperature(25, 40)
}

fun currentTemperature (morningTemperature: Int, afternoonTemperature: Int)
{
    var average = (morningTemperature + afternoonTemperature) / 2
    return (println("Avergae temperature is $average"))
}