fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed { index, num ->
        nums.find { it == target - num && nums.indexOf(it) != index}?.let {
            return@twoSum intArrayOf(index, nums.indexOf(it))
        }
    }
    return intArrayOf()
}


fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
    println(twoSum(intArrayOf(3, 2, 4), 6).contentToString())
    println(twoSum(intArrayOf(3, 3), 6).contentToString())
}