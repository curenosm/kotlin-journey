package com.curenosm.leetcode

class MaxPairSumInAnArray {
  class Solution {

    private fun maxDigit(s: String): Int {
      for (d in 9 downTo -1) if (s.indexOf(d.digitToChar()) != -1) return d
      return -1
    }

    fun maxSum(nums: IntArray): Int {
      var nums = nums
      nums.sortDescending()
      var max = -1

      for (i in nums.indices) for (j in nums.indices) if (
        i != j &&
          maxDigit(nums[i].toString()) == maxDigit(nums[j].toString()) &&
          nums[i] + nums[j] > max
      )
        max = nums[i] + nums[j]

      return max
    }
  }
}
