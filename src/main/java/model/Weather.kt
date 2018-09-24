package model

import model.Vehicle.*

enum class Weather(val craterChangeFactor: Float, val vehicles: List<Vehicle>) {
    SUNNY(-1f / 10, listOf(BIKE, TUKTUK, CAR)),
    RAINY(1f / 20, listOf(TUKTUK, CAR)),
    WINDY(0f, listOf(BIKE, CAR))
}
