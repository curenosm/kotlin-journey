package com.curenosm.leetcode

class SplitAStringInBalancedStrings {
  class Solution {
    fun balancedStringSplit(s: String): Int {
      var (res, balance) = arrayOf(0, 0)

      for (c in s) {
        balance +=
          when (c) {
            'L' -> 1
            'R' -> -1
            else -> 0
          }
        res += if (balance == 0) 1 else 0
      }

      return res
    }
  }
}
