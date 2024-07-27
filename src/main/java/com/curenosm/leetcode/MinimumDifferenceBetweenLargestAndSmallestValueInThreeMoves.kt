package com.curenosm.leetcode

class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {
  class Solution {
    fun minDifference(nums: IntArray): Int {
      var nums = nums
      nums.sort()
      val list = nums.toMutableList()
      val combinations = mutableListOf<List<Int>>()

      for (x in 0..1) for (y in 0..1) for (z in 0..1) combinations.add(mutableListOf(x, y, z))

      var min = Int.MAX_VALUE

      for (comb in combinations) {
        var (l, r) = arrayOf(0, list.lastIndex)
        for (e in comb) if (l < r) if (e == 1) r -= 1 else l += 1

        if (list[r] - list[l] < min) min = list[r] - list[l]
      }

      return min
    }
  }
}
