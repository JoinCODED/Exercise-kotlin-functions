import kotlin.math.round

fun main() {
    var avgTemp: Int = currentTemperature(25, 40);

    greetTraveler();
    println(findOasis(10, 20));
    println("Average Temperature: $avgTemp");

    // startCamelRide func call with all args
    println("Camel Ride: Distance = ${startCamelRide(5, 10)} km, Speed = 5 km/h, Time = 10 hour");

    // startCamelRide func call with 1 arg and default
    // NOTE: changed param: time to 10 to match expected result in task with default arg
    println("Camel Ride: Distance = ${startCamelRide(10)} km, Speed = 5 km/h, Time = 10 hour");

    // Trying out format method with point precision
    println("Time to Climb the Dune: %.2f hours".format(
        exploreDune(climbRatePerHour = 3, height = 20)
    ));

    println("Survival Chance: %d".format(
        survivalChance(survivalChance = 8)
    ));
}

fun greetTraveler() {
    println("Welcome to the Desert, Traveler!");
}

fun findOasis (x: Int, y: Int): String {
    return "Oasis found at coordinates ($x, $y)";
}

fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int {
    return (morningTemperature + afternoonTemperature) / 2;
}

fun startCamelRide(time: Int, speed: Int = 5): Int {
    return time * speed;
}

fun exploreDune(height: Int, climbRatePerHour: Int): Float {
    return height.toFloat() / climbRatePerHour;
}

fun survivalChance(survivalChance: Int): Int = survivalChance * 10;
