import java.util.regex.Pattern

class Exam {

    // FizzBuzz
    fun fizzBuzz() {
        for (i in 1..100) {
            println(
                when {
                    i % 15 == 0 -> "FizzBuzz"
                    i % 5 == 0 -> "Buzz"
                    i % 3 == 0 -> "Fizz"
                    else -> "$i"
                }
            )
        }
    }


    // FizzBuzz with start and end
    fun fizzBuzz(start: Int, end: Int) {
        for (i in start..end) {
            println(
                when {
                    i % 15 == 0 -> "FizzBuzz"
                    i % 5 == 0 -> "Buzz"
                    i % 3 == 0 -> "Fizz"
                    else -> "$i"
                }
            )
        }
    }

    // String Calculator
    fun add(input: String): Int {
        val array = input.toCharArray()
        var flag = false
        var result = 0
        for (c in array) {
            if (flag && c == 'n') {
                flag = false
                continue
            }
            if (c == '\\') {
                flag = true
                continue
            }
            if (c == ',') {
                continue
            }
            result += c.toString().toInt()
        }
        return result
    }
}