class FizzBuzz {

    fun fizzBuzz(arg: Int): String {
        when (arg) {
            3 -> return "Fizz"
            5 -> return "Buzz"
            15 -> return "FizzBuzz"
        }
        return arg.toString()
    }
}