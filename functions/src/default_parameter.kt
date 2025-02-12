fun startCamelRide (time: Int = 5, speed: Int = 5) {
    val distance = time * speed
    println ("Distance: $distance km, Time: $time hours, Speed: $speed km/h")

}

fun main () {
    startCamelRide(2, 10)
    startCamelRide(3)
}