package com.curenosm.leetcode

class ThirdMaximumNumber {
  class Solution {
    fun thirdMax(nums: IntArray): Int {
      val max = nums.distinct().sortedDescending().toTypedArray()
      return if (max.size >= 3) max[2] else max[0]
    }
  }
}
