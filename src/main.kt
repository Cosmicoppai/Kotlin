var name: String? = "Kanak"


fun greet(greeting:String, vararg itemsToGreet:String) {

    // We can also use something like fun greet(greeting : String, vararg itemsToGreet: String){ remaining code }
    // vararg is similar to *args in python

    itemsToGreet.forEach {itemToGreet ->
    println("$greeting $itemToGreet")}
}

fun notmain(){
    when(name){
        null -> println("Nana")
        else -> println("kanak san")
    }
}


fun main() {
    println("Oyasumi")
    notmain()
    val names: Array<String> = arrayOf("Kanak", "Mori Nana", "Odakawa", "Tanjiro", "Hanagaki")
    greet(greeting = "Hajimemashite", *names)

    // if we had defined the fun with vararg
    // greet(greeting = "Hajimemashite", ...itemsToGreet: "Kanak", "Nana", "Odakawa", "Tanjiro", "Hanagaki"
}