package sorting_algorithms


// worst and avg case Performance O(N^2)
// worst space complexity O(1)


fun <T: Comparable<T>> bubbleSort(array: Array<T>){
    val length = array.size - 1
    // println(length)
    for(i in 0..length){
        var isSwapped = false
        for(j in 1..length){
            if(array[j] < array[j-1]){
                array[j] = array[j-1].also{array[j-1] = array[j]}  // read as a = b, also b = a
                isSwapped = true
            }
        }
        if (!isSwapped) break  // if elements are in order break the loop
    }

}

var list1 = arrayOf(5, 4, 3, 2, 1, 0)
var list2 = arrayOf(7, 100, 0, 1, 2, 5, -5, -89)

fun main(){
    bubbleSort(list1)
    println("List1 after sorting:- ${list1.contentToString()}")  // to convert array in human readable format
    bubbleSort(list2)
    println("List1 after sorting:- ${list2.contentToString()}")
}

// Arrays.toString(array)  -> This is also used to convert array in the human readable format