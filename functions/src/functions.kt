fun greetTraveler() {
    println("Welcome to the Desert, Traveler!")
}
fun findOasis(x: Int, y: Int): String {
    return "Oasis found at coordinates ($x, $y)"
}
fun currentTemperature(morningTemperature : Int, afternoonTemperature: Int): String{
    return "Average Temperature: ${(morningTemperature + afternoonTemperature) / 2}"
}
fun startCamelRide(time: Int, speed: Int = 5): String{
    return "Camel Ride: Distance = ${time * speed} km, Speed = $speed km/h, Time = $time hours"
}
fun exploreDune(height: Double, climbRate: Double): String {
    return "Time to Climb the Dune: ${height / climbRate} hours"
}
fun survivalChance(supplies: Int): String {
    return "Survival chance: ${supplies * 10}"
}
fun main(){
    greetTraveler()
    println(findOasis(10, 20))
    println(currentTemperature(25, 40))
    println(startCamelRide(10, 5))
    println(startCamelRide(10))
    println(exploreDune(20.0,3.0))
    println(survivalChance(8))
}