
fun currentTemperature (morningTemperature: Int, afternoonTemperature: Int): Int {

 return (morningTemperature + afternoonTemperature) / 2
}

fun main () {
 println( " Average Temperature " + currentTemperature (25 , 40))
}