fun main()
{
    greetTraveler() //step 1

    println(findOasis(10,20)) //step 2

    var averageTemp = currentTemperature(25, 40)
    println("Average Temperature: $averageTemp") //step 3

    startCamelRide(10, 5)
    startCamelRide(10) //step 4

    exploreDune(climbRate = 3.0,  height = 20.0) //step 5

    var chance = survivalChance(8)
    println("Survival Chance: $chance")



}

fun greetTraveler()
{
    println("Welcome to the Desert, Traveler!")
}

fun findOasis( x: Int ,y: Int): String
{
    return "Oasis found at coordinates ($x, $y)"
}

fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int ): Int
{
    return (morningTemperature + afternoonTemperature) / 2
}

fun startCamelRide(time: Int , speed: Int = 5){
     var distance = time * speed
     println("Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours ")
}

fun exploreDune(height: Double, climbRate: Double ){
    var timeRequired = height / climbRate
    var timeRequiredRound = String.format("%.2f", timeRequired)
    println("Time to Climb the Dune: $timeRequiredRound hours")
}

fun survivalChance(supplies: Int) = supplies * 10