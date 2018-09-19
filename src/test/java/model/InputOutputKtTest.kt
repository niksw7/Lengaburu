package model

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class InputOutputKtTest {

    @Test
    fun calculateSpeed() {
        val (vehicle, speed) = calculateSpeed(Vehicle.BIKE, Weather.SUNNY, Orbit.ORBIT1, 100)
        assertEquals(Vehicle.BIKE, vehicle)
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