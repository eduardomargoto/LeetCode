fun gcdOfStrings(str1: String, str2: String): String {
    if (str1 + str2 != str2 + str1) return ""
    var str1Length = str1.length
    var str2Length = str2.length
    while (str1Length != str2Length) {
        if (str1Length > str2Length) str1Length -= str2Length
        else str2Length -= str1Length
    }
    return str1.substring(0, str1Length)
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
