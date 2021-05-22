package class01

internal class Owarimasu(val firstName:String, val lastName:String) {

    var middleName: String? = null
    set(value) {
        field = value
        println("The new middleName is $value")
    }

    init {
        println("init 1")
    }

    constructor(): this("Gohan", "Son"){
        println("Secondary Constructor")
    }

    init{
        println("init 2")
    }

    fun relation(): String {
        return "$middleName is the father of the $firstName"
    }


}

fun main(){
    println("nanka tsukarechata")
    val person = Owarimasu("Kanak", "Chaudhari")
    println(person.firstName)
    println(person.lastName)
}
