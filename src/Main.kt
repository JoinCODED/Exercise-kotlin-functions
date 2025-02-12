import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    greetTraveler()
    findOasis(10,20)
    println("Average Temperature: ${currentTemperature(25,40)}")
    startCamelRide()
    startCamelRide(20)
    println("Time to Climb the Dune: ${exploreDune(20.toDouble(),3.toDouble())}")
    println("Survival Chance: ${survivalChance(8)}")
}

fun greetTraveler(){
    println("Welcome to the desert, Traveler!")
}

fun findOasis(x: Int, y: Int){
    println("Oasis found at coordinates ($x, $y)")
}

fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int{
    return ( morningTemperature + afternoonTemperature ) / 2
}

fun startCamelRide(time: Int = 10,speed: Int = 5){
    println("Camel Ride: Distance = ${time * speed} km, Speed = $speed km/h, Time = $time hours")
}

fun exploreDune(height: Double, climbRate: Double): Double{
    return roundOffDecimal(height / climbRate)
}

fun roundOffDecimal(number: Double): Double {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    return df.format(number).toDouble()
}

fun survivalChance(supplies: Int): Int{
    return supplies * 10
}