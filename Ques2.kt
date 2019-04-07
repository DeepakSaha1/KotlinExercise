import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter a string: ")
    val str1 = reader.nextLine()

    val arrayOfString = str1.split(" ")
    val freqs = hashMapOf<String, Int>()

    for (item in arrayOfString) {
        if (item !in freqs)
            freqs[item] = 1
        else
            freqs[item] = freqs[item]!! + 1
    }
    println("\nDuplicate word in the given string: ")
    for (item in freqs.keys)
        println("$item : ${freqs[item]}")
    reader.close()
}
