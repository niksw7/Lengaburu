import model.Weather
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ParserTest {
    @Test
    fun convertInputStringToInputObject() {
        val parser = Parser()
        val input = """Weather is Sunny
Orbit1 traffic speed is 12 megamiles/hour
Orbit2 traffic speed is 10 megamiles/hour"""
        val inputObj = parser.parse(input)
        assertEquals(Weather.SUNNY, inputObj.weather)
        assertEquals(12, inputObj.orbit1TrafficSpeed)
        assertEquals(10, inputObj.orbit2TrafficSpeed)
    }
}