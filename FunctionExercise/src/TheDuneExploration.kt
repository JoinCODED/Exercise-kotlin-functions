fun exploreDune(height: Int, climbRate: Int) {
    val time = height.toDouble() / climbRate
    println("Time to Climb the Dune: $time hours")
}

fun main() {
    exploreDune(climbRate = 3, height = 20)
}