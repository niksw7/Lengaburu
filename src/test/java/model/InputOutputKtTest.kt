package model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class InputOutputKtTest {

    @Test
    fun calculateSpeed() {
        val speed = Vehicle.BIKE.calculateAverageSpeed(Weather.SUNNY, Orbit.ORBIT1, 100)
        assertEquals(8.695652f, speed)
    }

    @Test
    fun getOutputCase1() {
        val input = Input(Weather.SUNNY, 12, 10)
        val (vehicle, orbit) = getOutput(input)
        assertEquals(Vehicle.TUKTUK, vehicle)
        assertEquals(Orbit.ORBIT1, orbit)
    }

    @Test
    fun getOutputCase2() {
        val input = Input(Weather.WINDY, 14, 20)
        val (vehicle, orbit) = getOutput(input)
        assertEquals(Vehicle.CAR, vehicle)
        assertEquals(Orbit.ORBIT2, orbit)
    }
}