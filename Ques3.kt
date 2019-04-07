import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter a string: ")
    val str1 = reader.nextLine()

    print("Enter a character: ")
    val str2 = reader.next()

    val totalLength = str1.length
    val totalLengthAfterReplaced = str1.replace(str2, "").length

    println("No. of occurences of the character are ${totalLength - totalLengthAfterReplaced}")

    reader.close()
}
