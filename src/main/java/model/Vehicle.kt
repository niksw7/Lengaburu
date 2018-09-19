package model


enum class Vehicle(val maxSpeed: Int, val timePerCrater: Int) {
    BIKE(10, 2),
    TUKTUK(12, 1),
    CAR(20, 3)
}