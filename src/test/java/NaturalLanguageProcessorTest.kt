import model.Orbit.ORBIT2
import model.Output
import model.Vehicle.CAR
import model.Weather
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class NaturalLanguageProcessorTest {
    private lateinit var naturalLanguageProcessor: NaturalLanguageProcessor

    @BeforeAll
    fun before() {
        naturalLanguageProcessor = NaturalLanguageProcessor()
    }

    @Test
    fun convertInputStringToInputObject() {

        val input = """Weather is Sunny
Orbit1 traffic speed is 12 megamiles/hour
Orbit2 traffic speed is 10 megamiles/hour"""
        val inputObj = naturalLanguageProcessor.parse(input)
        assertEquals(Weather.SUNNY, inputObj.weather)
        assertEquals(12, inputObj.orbit1TrafficSpeed)
        assertEquals(10, inputObj.orbit2TrafficSpeed)
    }

    @Test
    fun getStatement() {
        assertEquals("Vehicle Car on Orbit2", naturalLanguageProcessor.getStatement(Output(CAR, ORBIT2)))
    }
}