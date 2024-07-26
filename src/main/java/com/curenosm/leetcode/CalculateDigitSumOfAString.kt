package com.curenosm.leetcode

class CalculateDigitSumOfAString {
  class Solution {
    private fun String.digitsSum() =
      this.filter { it.isDigit() }.map { it.digitToInt() }.sum().toString()

    fun digitSum(s: String, k: Int): String {
      var str = StringBuilder(s)

      while (str.length > k) str = StringBuilder(str.chunked(k).joinToString("") { it.digitsSum() })

      return str.toString()
    }
  }
}
