import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FizzBuzzTest {

    private val subject: FizzBuzz = FizzBuzz()

    @Test
    fun fuzzBuzz() {
        val testArg = 1
        assertEquals(testArg.toString(), subject.fizzBuzz(testArg))
    }
}