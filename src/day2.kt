import java.util.Scanner
import class01.Owarimasu


fun day2(number: Int): String {
    return when {
        number == 0 -> "0"
        number < 10 -> "less than 10"
        else -> "greater than 10"
    }

}

fun formatter(ans: String) = println("The number chosen by the user is $ans")



fun main(){
    println("Day2 hajimari masu")

    /* val reader = Scanner(System.`in`)
    println("Enter a number:")
    val num: Int = reader.nextInt()
    val a: String = day2(num)
    formatter(a) */

    // if(day2(num) is String) println("Yes") else println("No")

    // val person = Owarimasu("Kanak", "Chaudhari")
    val person = Owarimasu()  // Here default values from constructor will be used
    println(person.firstName)
    println(person.lastName)
    person.middleName = "Goku"
    println(person.relation())
}
