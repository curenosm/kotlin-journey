package com.curenosm.leetcode

class GetMaximumInGeneratedArray {
  class Solution {
    fun getMaximumGenerated(n: Int): Int {
      val nums = IntArray(n + 1)

      return (0 until n + 1)
        .onEach { i ->
          when {
            i == 0 -> nums[i] = 0
            else -> Unit
          }
          when {
            i == 1 -> nums[i] = 1
            else -> Unit
          }
          when {
            2 * i in (2..n) -> nums[2 * i] = nums[i]
            else -> Unit
          }
          when {
            2 * i + 1 in (2..n) -> nums[2 * i + 1] = nums[i] + nums[i + 1]
            else -> {}
          }
        }
        .maxOfOrNull { nums[it] } ?: -1
    }
  }
}
