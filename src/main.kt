var name: String? = "Kanak"

fun main() {
    println("Oyasumi")
    notmain()
}

fun notmain(){
    when(name){
        null -> println("Nana")
        else -> println("kanak san")
    }
}