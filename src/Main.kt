fun main() {
    greetTraveler();
    var oasis = findOasis(10,20);
    var curTemperature = currentTemperature(25,40);
    var startCamelRide1 = startCamelRide(10, 5)
    var startCamelRide2 = startCamelRide(10)
    var dune = exploreDune(climbRate=3, height=20);
    var chances = survivalChance(8);

    println(oasis);
    println(curTemperature);
    println(startCamelRide1);
    println(startCamelRide2);
    println(dune);
    println(chances);


}


fun greetTraveler(){
    println("Welcome to the Desert, Traveler!");
}

fun findOasis(x:Int, y:Int):String {
    return "Oasis found at coordinates ($x, $y)";
}

fun currentTemperature(morningTemperature:Int, afternoonTemperature:Int):String{
    var avgTempreture  = (morningTemperature+ afternoonTemperature)/2
    return "Average Temperature: ${avgTempreture}";
}

fun startCamelRide(time:Int, speed:Int=5):String{
    var distance = time * speed;
    return "Distance = $distance km, Speed = $speed km/h, Time = $time hours";
}

fun exploreDune(height:Int, climbRate:Int) :String{
    return "Time to Climb the Dune: ${(height.toDouble()/climbRate.toDouble()).toDouble()} hours";
}

fun survivalChance(numOfSupplies:Int):String{
    return "Survival Chance: ${numOfSupplies*10}";
}
