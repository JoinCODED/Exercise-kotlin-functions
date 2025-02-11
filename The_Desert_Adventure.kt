fun main() {
    greetTraveler()
    println(findOasis(10, 20))
    println(currentTemperature(25,40))
    startCamelRide(10, 5)
    startCamelRide(10)
    var timeRequired = exploreDune(climbRate = 3.0, height = 20.0)
    println("Time to Climb the Dune: %.2f hours".format(timeRequired))
    println(" survival chance =  ${survivalChance(8)}")
}

fun greetTraveler() {
    println("Welcome to the Desert, Traveler!")
}

fun findOasis(x: Int, y: Int): String {
    return "Oasis found at coordinates ($x, $y)"
}
fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int {
    return (morningTemperature + afternoonTemperature)/2

}
fun startCamelRide(time: Int, speed: Int = 5) {
    var distance = time * speed
    println("Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours")
}
fun exploreDune(height: Double, climbRate: Double): Double {
    return height / climbRate
}
fun survivalChance(supplies: Int): Int {
    var survival_Chance = supplies * 10
    return survival_Chance
}