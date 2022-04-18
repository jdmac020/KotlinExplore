import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FizzBuzzTest {

    private val subject: FizzBuzz = FizzBuzz()

    @Test
    fun `Function fizzBuzz returns int when standard`() {
        val testArg = 1
        assertEquals(testArg.toString(), subject.fizzBuzz(testArg))
    }

    @Test
    fun `Function fizzBuzz returns Fizz for 3`() {
        val testArg = 3
        assertEquals("Fizz", subject.fizzBuzz(testArg))
    }

    @Test
    fun `Function fizzBuzz returns Buzz for 5`() {
        val testArg = 5
        assertEquals("Buzz", subject.fizzBuzz(testArg))
    }

    @Test
    fun `Function fizzBuzz returns FizzBuzz for 15`() {
        val testArg = 15
        assertEquals("FizzBuzz", subject.fizzBuzz(testArg))
    }
}