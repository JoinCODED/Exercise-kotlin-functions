fun exploreDune(height: Int, climbRate: Int ){
    var time: Double = climbRate.toDouble()/height.toDouble()
    time = Math.round(time * 100.00) / 100.00
    println("Time to Climb the Dune: $time hours")
}

fun main(){
    // 5th task
    exploreDune(3,20)
}