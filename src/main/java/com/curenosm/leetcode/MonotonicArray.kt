package com.curenosm.leetcode

class MonotonicArray {
  class Solution {
    fun isMonotonic(nums: IntArray) =
      nums
        .fold(true to Int.MIN_VALUE) { pair, n ->
          if (pair.first && pair.second <= n) (true to n) else (false to n)
        }
        .first ||
        nums
          .fold(true to Int.MAX_VALUE) { pair, n ->
            if (pair.first && n <= pair.second) (true to n) else (false to n)
          }
          .first
  }
}
