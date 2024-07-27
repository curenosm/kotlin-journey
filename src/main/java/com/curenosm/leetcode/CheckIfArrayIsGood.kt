package com.curenosm.leetcode

// last

class CheckIfArrayIsGood {
  class Solution {
    fun isGood(nums: IntArray): Boolean {
      if (nums.size == 2) return nums.first() == 1 && nums.last() == 1

      val freq = (1..<nums.size).associateWith { 0 }.toMutableMap()
      for (n in nums) if (!freq.containsKey(n)) return false
      else freq[n] = freq.getOrElse(n) { 0 } + 1

      for (i in 1..<nums.size) if (freq.getOrElse(i) { 0 } == 0) return false

      return freq.getOrElse(nums.size - 2) { 0 } == 1 && freq.getOrElse(nums.size - 1) { 0 } == 2
    }
  }
}
