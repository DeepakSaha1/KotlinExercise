import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter the array with space separated elements: ")
    val list1 = reader.nextLine().split(" ")

    print("Enter the array with space separated elements: ")
    val list2 = reader.nextLine().split(" ")

    val list3 = hashSetOf<String>()

    for (i in list1){
        for (j in list2){
            if(i==j)
                list3.add(i)
        }
    }

    println(list3)
    reader.close()
}
