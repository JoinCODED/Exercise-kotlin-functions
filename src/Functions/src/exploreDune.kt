fun exploreDune ( height: Int, climeRate: Int ): Double {

    return height/ climeRate.toDouble()
}

fun main () {

    println(" Time to Climb the Dune: =" +  exploreDune( 20, 3) + " hours")
//println (exploreDune(20.0, 3.0))
}