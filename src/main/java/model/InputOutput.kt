package model

import model.Orbit.ORBIT1
import model.Orbit.ORBIT2

data class Input(val weather: Weather, val orbit1TrafficSpeed: Int, val orbit2TrafficSpeed: Int) {}

data class Output(val vehicle: Vehicle, val orbit: Orbit)


fun getOutput(input: Input): Output {
    val availableVehicles = input.weather.vehicles
    val (vehicle1, speed1) = orbit1BestVehicleAndTopSpeed(availableVehicles, input)

    val (vehicle2, speed2) = orbit2BestVehicleAndTopSpeed(availableVehicles, input)

    return if (ORBIT1.timeTakenWith(speed1) < ORBIT2.timeTakenWith(speed2)) {
        Output(vehicle1, ORBIT1)
    } else {
        Output(vehicle2, ORBIT2)
    }
}

fun orbit1BestVehicleAndTopSpeed(availableVehicles: List<Vehicle>, input: Input): Pair<Vehicle, Float> {
    return availableVehicles.asSequence().map { vehicle ->
        Pair(vehicle, vehicle.calculateAverageSpeed(input.weather, ORBIT1, input.orbit1TrafficSpeed))
    }
            .sortedWith(compareBy({ it.second }, { it.first.ordinal })).last()
}

fun orbit2BestVehicleAndTopSpeed(availableVehicles: List<Vehicle>, input: Input) =
        availableVehicles.asSequence().map { vehicle ->
            Pair(vehicle, vehicle.calculateAverageSpeed(input.weather, ORBIT2, input.orbit2TrafficSpeed))
        }
                .sortedWith(compareBy({ it.second }, { it.first.ordinal })).last()

