fun main() {
    var avgTemp: Int = currentTemperature(25, 40);

    greetTraveler();

    println(findOasis(10, 20));
    println("Average Temperature: $avgTemp");
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