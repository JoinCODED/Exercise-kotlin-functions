fun main() {
    greetTraveler()
    findOasis(10,20)
    println("Average Temperature: ${currentTemperature(25, 40)}")
    startCamelRide(10,5)
    startCamelRide(10)
    exploreDune(climbRate = 3.0, height = 20.0)
    println("Survival Chance: ${survivalChance(supplies = 8)}")
}

fun greetTraveler() {
    println("Welcome to the Desert, Traveler!")
}

fun findOasis(x: Int, y: Int) {
    println("Oasis found at coordinates ($x, $y)")
}

fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int {
    return((morningTemperature + afternoonTemperature) / 2)
}

fun startCamelRide(time: Int, speed: Int = 5) {
    var distance = time * speed
    println("Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours")
}

fun exploreDune(height: Double, climbRate: Double) {
    var time = height / climbRate
    println("Time to Climb the Dune: $time hours")
}

fun survivalChance(supplies: Int) = supplies * 10
