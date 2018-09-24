import model.Input
import model.Output
import model.Weather

class NaturalLanguageProcessor {
    fun parse(input: String): Input {
        val weatherRegex = "Weather is (\\w*)".toRegex()
        val orbitTrafficSpeedRegex = "Orbit\\d traffic speed is (\\d*)".toRegex()
        val inputs = input.split("\n")
        return Input(
                Weather.valueOf(weatherRegex.find(inputs[0])!!.groupValues[1].toUpperCase()),
                orbitTrafficSpeedRegex.find(inputs[1])!!.groupValues[1].toInt(),
                orbitTrafficSpeedRegex.find(inputs[2])!!.groupValues[1].toInt())
    }

    fun getStatement(output: Output): String {
        return "Vehicle ${output.vehicle} on ${output.orbit}"
    }

}