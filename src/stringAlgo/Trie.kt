package stringAlgo

// Trie implementation in Kotlin

class Trie {

    data class Node(var word: String? = null, val childNode: MutableMap<Char, Node> = mutableMapOf())

    private val root = Node()

    fun insert(word: String) {
        var currentNode = root
        // println(currentNode)
        for (char in word) {
            if (currentNode.childNode[char] == null) {
                currentNode.childNode[char] = Node()
            }
            currentNode = currentNode.childNode[char]!!
        }
        currentNode.word = word
    }

    fun search(word: String): Boolean {
        var currentNode = root
        for (char in word) {
            if (currentNode.childNode[char] == null) {
                return false
            }
            currentNode = currentNode.childNode[char]!!
        }
        return currentNode.word != null

    }

    fun isStartWith(word: String): Boolean {
        var currentNode = root
        for (char in word) {
            if (currentNode.childNode[char] == null) {
                return false
            }
            currentNode = currentNode.childNode[char]!!

        }
        return currentNode.word == null
    }
}

fun main(){
    val name = "kANAK"
    val trie = Trie()
    println(trie.insert(name))
    println(trie.search(name))
}