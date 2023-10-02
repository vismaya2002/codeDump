fun main() {
    println("Enter a string:")
    val inputString = readLine() ?: ""
    
    println("Enter the character to find:")
    val targetCharInput = readLine()
    
    // Check if targetCharInput is a single character
    if (targetCharInput?.length == 1) {
        val targetChar = targetCharInput[0]
        
        // TODO: Implement the logic to find the frequency of the character in the input string.
        val frequency = findCharacterFrequency(inputString, targetChar)
        
        println("The character '$targetChar' appears $frequency times in the string.")
    } else {
        println("Please enter a single character as the target character.")
    }
}

fun findCharacterFrequency(inputString: String, targetChar: Char): Int {
    var frequency = 0

    for (char in inputString) {
        if (char == targetChar) {
            frequency++
        }
    }

    return frequency
}
