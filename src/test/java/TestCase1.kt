import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun test1() {
        assertEquals("","")
        val input = """Weather is Sunny
Orbit1 traffic speed is 12 megamiles/hour
Orbit2 traffic speed is 10 megamiles/hour"""
        val expectedOutput = "¡Vehicle TukTuk on Orbit1"

    }
}