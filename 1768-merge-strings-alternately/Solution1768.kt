fun mergeAlternately(word1: String, word2: String): String {
    var stringEnd = ""
    var stringMerged = ""

    val minLength = if (word1.length < word2.length) {
        stringEnd = word2.substring(word1.length, word2.length)
        word1.length
    } else {
        stringEnd = word1.substring(word2.length, word1.length)
        word2.length
    }

    for (index in 0..minLength-1) {
        stringMerged += word1[index]
        stringMerged += word2[index]
    }
    return stringMerged + stringEnd
}

fun main() {
    println(mergeAlternately("abc", "pqr"))
    println(mergeAlternately("ab", "pqrs"))
    println(mergeAlternately("abcd", "pq"))
}