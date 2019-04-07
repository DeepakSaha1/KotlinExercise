import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter the array with space separated elements: ")
    val list1 = reader.nextLine().split(" ")

    val map1 = hashMapOf<String, Int>()

    for (i in list1) {
        if (i !in map1)
            map1[i] = 1
        else
            map1[i] = map1[i]!! + 1
    }
    for (i in map1.keys) {
        if (map1[i]!! == 1) {
            println("The character which is not occurred twice $i")
            break
        }
    }
    reader.close()
}
