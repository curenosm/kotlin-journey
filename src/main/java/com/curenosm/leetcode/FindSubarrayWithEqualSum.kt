package com.curenosm.leetcode

class FindSubarrayWithEqualSum {
  class Solution {
    fun findSubarrays(nums: IntArray): Boolean {
      val set = mutableSetOf<Int>()

      for (i in 0 until nums.size - 1) {
        val sum = nums.copyOfRange(i, i + 2).sum()
        if (set.contains(sum)) return true
        set.add(sum)
      }

      return false
    }
  }
}
