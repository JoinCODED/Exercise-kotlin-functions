fun main() {
    startCamelRide(10, 5)
    startCamelRide(10)
}
fun startCamelRide(time: Int, speed: Int = 5) {
    val distance = time * speed
    println("Camel Ride: Distance = $distance km, Speed = $speed km/h, Time = $time hours")
}
