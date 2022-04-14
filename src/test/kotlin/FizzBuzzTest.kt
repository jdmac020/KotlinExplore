import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FizzBuzzTest {

    private val subject: FizzBuzz = FizzBuzz()

    @Test
    fun fizzBuzz_returns_int() {
        val testArg = 1
        assertEquals(testArg.toString(), subject.fizzBuzz(testArg))
    }

    @Test
    fun fizzBuzz_returns_fizz() {
        val testArg = 3
        assertEquals("Fizz", subject.fizzBuzz(testArg))
    }

    @Test
    fun fizzBuzz_returns_buzz() {
        val testArg = 5
        assertEquals("Buzz", subject.fizzBuzz(testArg))
    }
}