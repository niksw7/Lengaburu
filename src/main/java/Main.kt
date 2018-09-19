import model.Input

fun main(args: Array<String>) {
    val input1 = "Input: Weather is Sunny"//readLine().toString()
    val weatherRegex = "Input: Weather is (\\w*)".toRegex()
    val a = CustomerCare()
    val orbitTrafficSpeedRegex = "Input: Orbit\\d traffic speed is (\\d*)".toRegex()

    val input2 = "Input: Orbit1 traffic speed is 12 megamiles/hour"
    val input3 = "Input: Orbit1 traffic speed is 10 megamiles/hour"
//    val weather = weatherRegex.find(input1)!!.groups[1]!!.value
//    val input = Input(
//            weather,
//            orbitTrafficSpeedRegex.find(input2)!!.groups[1]!!.value.toInt(),
//            orbitTrafficSpeedRegex.find(input3)!!.groups[1]!!.value.toInt())
//    /*println(input.weather)
//    println(input.orbit1TrafficSpeed)
//    println(input.orbit2TrafficSpeed)*/


}