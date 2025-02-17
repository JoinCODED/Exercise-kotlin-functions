fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int):Int{
    return (morningTemperature + afternoonTemperature)/2


}
fun main(){
 val result= currentTemperature(25,40)
    println("Average Temperature = $result ")
}