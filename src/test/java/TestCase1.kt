import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Test {
    @Test
    fun test1() {
        val input = """Weather is Sunny
Orbit1 traffic speed is 12 megamiles/hour
Orbit2 traffic speed is 10 megamiles/hour"""

        val actualAnswer = CustomerCare().shortestDistanceFromSilkDorbtoHallitharam(input)
        val expectedAnswer = "Vehicle TukTuk on Orbit1"
        assertEquals(expectedAnswer.toLowerCase(), actualAnswer.toLowerCase())

    }

    @Test
    fun test2() {
        val input = """Weather is Windy
Orbit1 traffic speed is 14 megamiles/hour
Orbit2 traffic speed is 20 megamiles/hour"""
        val expectedAnswer = "Vehicle Car on Orbit2"
        val actualAnswer = CustomerCare().shortestDistanceFromSilkDorbtoHallitharam(input)

        assertEquals(expectedAnswer.toLowerCase(), actualAnswer.toLowerCase())

    }
}