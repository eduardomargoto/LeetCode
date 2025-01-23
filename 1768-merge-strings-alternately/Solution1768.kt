fun mergeAlternately(word1: String, word2: String): String {
    var stringMerged = StringBuilder()
    var index1 = 0
    var index2 = 0
    while (index1 < word1.length && index2 < word2.length) {
        stringMerged
            .append(word1[index1++])
            .append(word2[index2++])
    }
    if (index1 < word1.length) {
        stringMerged.append(word1.substring(index1))
    }
    if (index2 < word2.length) {
        stringMerged.append(word2.substring(index2))
    }
    return stringMerged.toString()
}

fun main() {
    println(mergeAlternately("abc", "pqr"))
    println(mergeAlternately("ab", "pqrs"))
    println(mergeAlternately("abcd", "pq"))
}