fun gcdOfStrings(str1: String, str2: String): String {

    var totalDivisor1 = 0
    var totalDivisor2 = 0
    for (i in str2.length downTo 1) {
        val strToDivide = str2.substring(0, i)
        for (n in 0 until str1.length step i) {
            if (str1.length < n + i) break
            val strToCompare = str1.substring(n, n + i)
            if (strToCompare == strToDivide) {
                totalDivisor1++
            }
        }

        for (n in 0 until str2.length step i) {
            if (str2.length < n + i) break
            val strToCompare = str2.substring(n, n + i)
            if (strToCompare == strToDivide) {
                totalDivisor2++
            }
        }

        if (strToDivide.length * totalDivisor1 == str1.length
            && strToDivide.length * totalDivisor2 == str2.length
        ) {
            return strToDivide
        }

        totalDivisor1 = 0
        totalDivisor2 = 0
    }

    return ""
}

fun main() {

    println(gcdOfStrings("ABCABC", "ABC")) // expected: ABC
    println(gcdOfStrings("ABABAB", "ABAB")) // expected: AB
    println(gcdOfStrings("LEET", "CODE")) // expected: ""
    println(gcdOfStrings("ABCDEF", "ABC")) // expected: ""
    println(gcdOfStrings("ABABABAB", "ABAB")) // expected: ABAB
    println(
        gcdOfStrings(
            "TAUXXTAUXXTAUXXTAUXXTAUXX",
            "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"
        )
    ) // expected: TAUXX


}
