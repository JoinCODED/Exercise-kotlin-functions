fun main(){
    greetTraveler();
    println(findOasis(10, 20))
    println("Average Temperature: ${currentTemperature(25,40)}")
    startCamelRide(10,5)
    startCamelRide(10)
    println("Time to Climb the Dune: ${exploreDune(height = 20.0, climbRate = 3.0)} hours")
    println("Survival Chance: ${survivalChance(8)}")
}
fun greetTraveler(){
    println("Welcome to the Desert, Traveler!")
}
fun findOasis(x: Int, y: Int): String{
    return "Oasis found at coordinates ($x, $y)"
}
fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int {
    return (morningTemperature+afternoonTemperature)/2
}
fun startCamelRide(time: Int, speed: Int = 5){
    var distance= time * speed
   println("Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours")
}
fun exploreDune(height: Double, climbRate: Double): Double{
    return height / climbRate
}
fun survivalChance(supplyNum: Int): Int{
    return supplyNum*10
}
