package com.curenosm.leetcode

class SetMismatch {
  class Solution {

    private fun IntArray.elementsAppearingOnce() =
      this.toList().groupingBy { it }.eachCount().filter { it.value == 1 }.keys.toSet()

    fun findErrorNums(nums: IntArray) =
      intArrayOf(
        nums.toSet().minus(nums.elementsAppearingOnce()).first() ?: -1,
        (1..nums.size).find { it !in nums } ?: -1,
      )
  }
}
