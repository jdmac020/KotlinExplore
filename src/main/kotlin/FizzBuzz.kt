class FizzBuzz {

    fun fizzBuzz(arg: Int): String {
        if (arg == 3) {
            return "Fizz"
        } else if (arg == 5) {
            return "Buzz";
        }
        return arg.toString()
    }
}