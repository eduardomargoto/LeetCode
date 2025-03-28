class Solution868 {

    fun binaryGap(n: Int): Int {
        val binary = Integer.toBinaryString(n)
        var largestDistance = 0
        var startPoint = -1
        for ((index, num) in binary.withIndex()) {
            if (num == '1' && startPoint == -1) {
                startPoint = index
                continue
            }
            if (num == '1') {
                val distance = (index - startPoint)
                if (distance > largestDistance)
                    largestDistance = distance

                startPoint = index
            }
        }

        return largestDistance
    }
}

fun main() {
    val solution868 = Solution868()
    println(solution868.binaryGap(1041))
    println(solution868.binaryGap(22))
    println(solution868.binaryGap(8))
    println(solution868.binaryGap(5))
}