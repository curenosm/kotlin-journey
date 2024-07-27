package com.curenosm.leetcode

class KthMissingPositiveNumber {
  class Solution {
    fun findKthPositive(arr: IntArray, k: Int): Int {
      val set = arr.toSet()
      var count = 0

      (1..arr[arr.lastIndex] + k + 1).forEach {
        if (!set.contains(it)) {
          count += 1
          if (count == k) return it
        }
      }

      return -1
    }
  }
}
