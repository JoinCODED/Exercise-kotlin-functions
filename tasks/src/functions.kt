val speedDefault: Int = 5;

fun main() {
    greetTraveler();
    println(findOasis(10, 20));
    println("Average Temperature: ${currentTemperature(25, 40)}");
    println(startCamelRide(10, 5));
    println(startCamelRide(10));
    println(exploreDune(20.0, 3.0));
    println(survivalChance(8));

}

fun greetTraveler() {
    println("Welcome to the Desert, Traveler!");
}

fun findOasis(x: Int, y: Int): String {
    return "Oasis found at ($x, $y)";
}

fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int {
        return (morningTemperature + afternoonTemperature) / 2;
}

fun startCamelRide(time: Int, speed: Int = 5): String{
    var distance: Int = time * speed;
    return "Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours";
}

fun exploreDune(height: Double, climbRate: Double): String {
    return "Time to Climb the Dune: ${"%.2f".format(height / climbRate)} hours";
}

fun survivalChance(supplies: Int): String {
    return "Survival Chance: ${supplies * 10}";
}
