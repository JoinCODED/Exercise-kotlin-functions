fun main () {
    greetTraveler();
    println(findOasis(10,20));
    println("Average Temperature: ${currentTemperature(25,40)}");
    println(startCamelRide(time = 10));
    println(startCamelRide(speed = 5 , time = 10))
    println(startCamelRide(speed = 2 , time = 10))
    exploreDune(climbRate = 3.0, height = 20.0)
    println("Survival Chance: ${survivalChance(8)}");
    
}
//S1
fun greetTraveler (){
    println("Welcome to the Desert, Traveler!");
}
//S2
fun findOasis(x:Int, y:Int):String {
    return "Oasis found at coordinates ($x, $y)"
}
//S3
fun currentTemperature(morningTemperature: Int, afternoonTemperature:Int):Int{
    return (morningTemperature+afternoonTemperature)/2;
}
//S4
fun startCamelRide(speed: Int = 5, time:Int): String{
    return "Camel Ride: Distance = ${speed*time} km, Speed = $speed km/h, Time = $time hours";
}
//S5
fun exploreDune(height:Double, climbRate:Double){
    println("Time to Climb the Dune: ${height/climbRate} hours")
}
//S6
//Single-expression Fun
fun survivalChance(supplies:Int) = supplies * 10;