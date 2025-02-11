fun main() {
greetTraveler()
println( findOasis(2.5,11.1))
    println("Average Temperature: ${currentTemperature(29,60)}")
    startCamelRide(10,5)
    startCamelRide(10)

    exploreDune(climbRate = 4.0, height = 11.1)
    exploreDune(height = 11.1, climbRate = 4.0)

    println("Survival chance: ${survivalChance(7)}")
}


fun greetTraveler(){
    println("Welcome to the Desert, Traveler!")
}


fun findOasis(x:Double, y: Double): String{
    return "Oasis found at coordinates ($x,$y)"
}

fun currentTemperature(morningTemperature:Int, afternoonTemperature:Int): Int{
    return (morningTemperature+afternoonTemperature)/2
}

fun startCamelRide(time:Int, speed:Int = 5){
    var distance = time * speed
    println("Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours")
}


fun exploreDune(height: Double, climbRate: Double){
     println("Time to climb the Dune: ${height/climbRate} hours")
}

fun survivalChance (supplies:Int): Int{
    return supplies*10
}