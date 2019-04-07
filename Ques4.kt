import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter a string: ")
    val str1 = reader.nextLine() // My e-mail : eMail_Address321@anymail.com

    var noOfLowerCaseLetters: Int = 0
    var noOfUpperCaseLetters: Int = 0
    var noOfDigits: Int = 0
    var noOfSpecialChars: Int = 0

    for (char in str1) {
        when {
            char.isLowerCase() -> noOfLowerCaseLetters += 1
            char.isUpperCase() -> noOfUpperCaseLetters += 1
            char.isDigit() -> noOfDigits += 1
            else -> noOfSpecialChars += 1
        }
    }
    val totalChars: Int = noOfLowerCaseLetters + noOfUpperCaseLetters + noOfDigits + noOfSpecialChars

    println("No. of Lowercase letters: $noOfLowerCaseLetters, Percentage of Lowercase letters: ${(noOfLowerCaseLetters * 100 / totalChars).toFloat()}")
    println("No. of Uppercase letters: $noOfUpperCaseLetters, Percentage of Uppercase letters: ${(noOfUpperCaseLetters * 100 / totalChars).toFloat()}")
    println("No. of Digits: $noOfDigits, Percentage of Digits: ${(noOfDigits * 100 / totalChars).toFloat()}")
    println("No. of Special Characters $noOfSpecialChars, Percentage of Special Characters: ${(noOfSpecialChars * 100 / totalChars).toFloat()}")

    reader.close()
}
