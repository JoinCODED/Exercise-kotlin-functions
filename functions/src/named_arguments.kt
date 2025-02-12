fun exploreDune(height: Int, climbRate: Int) {
    val timeRequired = height.toDouble() / climbRate
    println("Time to Climb the Dune: $timeRequired hours")
}

fun main() {

    exploreDune(climbRate = 3, height = 20)

}