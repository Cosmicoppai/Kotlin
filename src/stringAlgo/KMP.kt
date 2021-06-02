package stringAlgo

// KMP Algorithm
// Time Complexity :- O(n)

fun kmp(text:String, pattern: String): Int{
    val textLength = text.length
    val patternLength = pattern.length

    if (patternLength == 0) return -1

    val prefixArray = preparePrefixArray(pattern)
    var patternIndex = 0
    var textIndex = 0

    while ((textIndex < textLength) && (patternIndex < patternLength)){
        if (pattern[patternIndex] == text[textIndex]){
            textIndex++
            patternIndex++
        }else{
            if (patternIndex != 0) patternIndex = prefixArray[patternIndex-1]
            else textIndex++
        }
        if (patternIndex == patternLength){
            return textIndex - patternIndex
        }
    }
    return -1
}

// function to prepare the prefixArray


fun preparePrefixArray(pattern:String): IntArray{
    val m = pattern.length
    val arr = IntArray(m)
    var index = 0
    var i = 1

    while (i < m){
        if (pattern[i] == pattern[index]){
            arr[i] = index + 1
            index++
            i++
        }else{
            if (index != 0) index = arr[index-1]
            else{
                arr[i] = 0
                i++
            }
        }
    }
return arr
}

fun main() {
    println(kmp("Hello Kotlin!!", "Ko"))
    println(kmp("Hello Kotlin!!", "Kos"))
    println(kmp("Hello", "el"))
    println(kmp("Hello Kotlin", "owel"))
    println(kmp("Hello", "lo"))
    println(kmp("Hello", "llw"))
    println(kmp("Hello", "llo"))

}