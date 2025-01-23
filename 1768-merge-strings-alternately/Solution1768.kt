fun mergeAlternately(word1: String, word2: String): String {
    var stringMerged = StringBuilder()
    val minLength = word1.length.coerceAtMost(word2.length)

    for (index in 0..minLength-1) {
        stringMerged.append("${word1[index]}${word2[index]}")
    }
    stringMerged.append(
        if (word1.length > word2.length) {
            word1.substring(minLength)
        } else {
            word2.substring(minLength)
        }
    )
    return stringMerged.toString()
}

fun main() {
    println(mergeAlternately("abc", "pqr"))
    println(mergeAlternately("ab", "pqrs"))
    println(mergeAlternately("abcd", "pq"))
}