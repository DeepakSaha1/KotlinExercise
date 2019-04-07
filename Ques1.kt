import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter a string: ")
    var str1 = reader.nextLine()
    print("Enter a substring to be replaced: ")
    val str2 = reader.nextLine()
    print("Enter a substring to replace with: ")
    val str3 = reader.nextLine()

    str1 = str1.replace(str2, str3)
    println(str1)

    reader.close()
}
