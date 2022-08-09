package com.leetcode.leo.leetcodeproject


fun main() {
    val array = intArrayOf(2, 3, 4)
    twoSum(array, 5)
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val resultArray = IntArray(2)
    for (x in 0..nums.lastIndex) {
        for (y in x + 1..nums.lastIndex) {
            if (nums[x] + nums[y] == target) {
                resultArray[0] = x
                resultArray[1] = y
            }
        }
    }
    return resultArray
}

