package model

data class Input(val weather: Weather, val orbit1TrafficSpeed: Int, val orbit2TrafficSpeed: Int)

data class Output(val vehicle: Vehicle, val orbit: Orbit)

fun getOutput(input: Input): Output {
    val availableVehicles = input.weather.vehicles

    val (vehicle1, speed1) = availableVehicles.asSequence().map { vehicle -> calculateSpeed(vehicle, input.weather, Orbit.ORBIT1, input.orbit1TrafficSpeed) }
            .sortedWith(compareBy({ it.second }, { it.first.ordinal })).last()

    val (vehicle2, speed2) = availableVehicles.asSequence().map { vehicle -> calculateSpeed(vehicle, input.weather, Orbit.ORBIT2, input.orbit2TrafficSpeed) }
            .sortedWith(compareBy({ it.second }, { it.first.ordinal })).last()

    return if (Orbit.ORBIT1.distance / speed1 < Orbit.ORBIT2.distance / speed2) {
        Output(vehicle1, Orbit.ORBIT1)
    } else {
        Output(vehicle2, Orbit.ORBIT2)
    }
}

fun calculateSpeed(vehicle: Vehicle, weather: Weather, orbit: Orbit, orbitTrafficSpeed: Int): Pair<Vehicle, Float> {
    val noOfCraters = orbit.craters + weather.craterChangeFactor * orbit.craters
    val totalTimeInHours = timeToCoverRoad(orbit, vehicle, orbitTrafficSpeed) + timeToCoverCrater(noOfCraters, vehicle) / 60
    return Pair(vehicle, orbit.distance / totalTimeInHours)

}

fun timeToCoverRoad(orbit: Orbit, vehicle: Vehicle, orbitTrafficSpeed: Int) = orbit.distance / Math.min(vehicle.maxSpeed, orbitTrafficSpeed)

fun timeToCoverCrater(noOfCraters: Float, vehicle: Vehicle) = noOfCraters * vehicle.timePerCrater
