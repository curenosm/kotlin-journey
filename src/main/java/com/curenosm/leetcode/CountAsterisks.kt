package com.curenosm.leetcode

class CountAsterisks {
  class Solution {
    fun countAsterisks(s: String): Int {
      var (pair, res) = arrayOf(0, 0)
      s.forEach {
        when (it) {
          '|' -> pair += 1
          else -> if (pair % 2 == 0 && it == '*') res += 1
        }
      }
      return res
    }
  }
}
