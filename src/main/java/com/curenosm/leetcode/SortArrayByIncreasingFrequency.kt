package com.curenosm.leetcode

class SortArrayByIncreasingFrequency {
  class Solution {
    fun frequencySort(nums: IntArray): IntArray {
      val freq = nums.toList().groupingBy { it }.eachCount()
      return nums
        .sortedWith { a, b ->
          val (countA, countB) = arrayOf(freq[a] ?: 0, freq[b] ?: 0)
          if (countA == countB) b - a else countA - countB
        }
        .toIntArray()
    }
  }
}
