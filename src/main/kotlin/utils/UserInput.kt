package utils

fun readIntNotNull(prompt: String): Int {
    do {
        try {
            print(prompt)
            return readln().toInt()
        } catch (e: Exception) {
            System.err.println("\tInvalid number. Please enter a valid integer.")
        }
    } while (true)
}

fun readNextInt (prompt: String?): Int {
    do {
        try {
            print(prompt)
            val input = readln()
            if (input.isBlank()) {
                System.err.println("\tInput cannot be empty. Please enter a valid number.")
                continue
            }
            return input.toInt()
        } catch (e: NumberFormatException) {
            System.err.println("\tInvalid input. Please enter a valid number. ")
        }
    } while (true)
}

fun readNextLine(prompt: String?): String {
    do {
        print(prompt)
        val input = readlnOrNull()
        if (input.isNullOrBlank()) {
            System.err.println("\tInput cannot be empty. Please enter text.")
        } else {
            return input
        }
    } while (true)
}

fun readNextChar(prompt: String?): Char {
    do {
        try {
            print(prompt)
            val input = readln()
            if (input.isBlank()) {
                System.err.println("\tInput cannot be empty. Please enter a valid character.")
                continue
            }
            return input.first()
        } catch (e: Exception) {
            System.err.println("\tInvalid input. Please enter a single character.")
        }
    } while (true)
}