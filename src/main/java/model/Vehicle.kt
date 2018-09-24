package model


enum class Vehicle(val maxSpeed: Int, val timePerCrater: Int) {
    BIKE(10, 2),
    TUKTUK(12, 1),
    CAR(20, 3);

    fun calculateAverageSpeed(weather: Weather, orbit: Orbit, orbitTrafficSpeed: Int): Float {
        val noOfCraters = orbit.craters + weather.craterChangeFactor * orbit.craters
        val totalTimeInHours = timeToCoverOrbitWith(orbit.distance, orbitTrafficSpeed) + timeToCoverCrater(noOfCraters) / 60
        return orbit.distance / totalTimeInHours
    }

    private fun timeToCoverOrbitWith(distance: Int, orbitTrafficSpeed: Int): Int {
        return distance / Math.min(maxSpeed, orbitTrafficSpeed)
    }

    private fun timeToCoverCrater(noOfCraters: Float): Float {
        return noOfCraters * timePerCrater
    }

    override fun toString(): String {
        return super.toString().toLowerCase().capitalize()
    }
}
