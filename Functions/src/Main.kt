//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    greetTraveler()
    findOasis(10,20)
    println(currentTemperature(25, 40))
    startCamelRide(10)
    startCamelRide(10, 10)
    exploreDune(climbRate = 3, height = 20)
    println("Survival Chance: ${survivalChance(8)}")
}

fun greetTraveler() {
    println("Welcome to the Desert, Traveler!")
}

fun findOasis(x: Int, y: Int) {
    println("Oasis found at coordinates ($x, $y)")
}

fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int {
    return (morningTemperature+afternoonTemperature)/2
}

fun startCamelRide(time: Int, speed: Int = 5) {
    var distance: Int = time * speed
    println("Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours")
}

fun exploreDune(height: Int, climbRate: Int) {
    var timeToClimb = height.toDouble()/climbRate.toDouble()
    println("Time to Climb the Dune: $timeToClimb hours")
}

fun survivalChance(supplies: Int): Int {
    return supplies * 10
}

