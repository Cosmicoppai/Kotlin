package sorting_algorithms

fun <T: Comparable<T>> mergeSort(array: Array<T>, start:Int, end:Int){

    val temp = arrayOfNulls<Comparable<*>>(array.size) as Array<T>

    if(start < end){
        val mid = start + (end-start) / 2
        mergeSort(array, start, mid)
        mergeSort(array, mid+1, end)
        merge(array, temp, start, mid, end)

    }
}

fun <T: Comparable<T>> merge(array:Array<T>, temp:Array<T>, start:Int, mid:Int, end: Int){
    System.arraycopy(array, start, temp, start,end-start+1)

    var i =start
    var j = mid + 1
    var k = start

    while(i <=mid && j<= end){
        if (temp[i] < temp[j]){
            array[k++] = temp[i++]
        }else{
            array[k++] = array[j++]
        }

    }
    while (i <= mid){
        array[k++] = temp[i++]
    }
    while (j <= end){
        array[k++] = temp[j++]
    }

}


private var list1 = arrayOf(5, 4, 3, 2, 1, 0)
private var list2 = arrayOf(7, 100, 0, 1, 2, 5, -5, -89)

fun main(){
    mergeSort(list1, 0, list1.size-1)
    println("List1 after sorting:- ${list1.contentToString()}")  // to convert array in human readable format
    mergeSort(list2, 0, list2.size-1)
    println("List1 after sorting:- ${list2.contentToString()}")
}