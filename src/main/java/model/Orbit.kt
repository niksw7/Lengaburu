package model

enum class Orbit(val distance: Int, val craters: Int) {
    ORBIT1(20, 10),
    ORBIT2(18, 20);

    fun timeTakenWith(speed: Float) = distance / speed
    override fun toString(): String {
        return super.toString().toLowerCase().capitalize()
    }

}