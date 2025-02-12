//Functions
fun main() {

    //function calls
    greetTraveler()
    findOasis(10,20)
    println("average temperature: " + currentTemperature(25F,40F))
    startCamelRide(10,5)
    startCamelRide(10)
    exploreDune(climbRate = 3F, height = 20F)
    println("Survival chance: " + survivalChance(8F) + "%")
}

fun greetTraveler(){
    println("Welcome to the Desert, Traveler!")
}

fun findOasis(x:Int, y:Int){
    println("Oasis found at coordinates ($x, $y).")
}

fun currentTemperature(morningTemperature:Float, afternoonTemperature:Float):Float{
    return morningTemperature+afternoonTemperature/2
}

fun startCamelRide(time:Int, speed:Int=5){
    val distance = time * speed
    println("Camel Ride: Distance = $distance km, Time = $time hours, Speed = $speed km/h")
}

fun exploreDune(height:Float, climbRate:Float){
    println("Time to climb the Dune: " + height/climbRate + " hours.")
}

fun survivalChance(supplies:Float):Float{
    return supplies*10
}