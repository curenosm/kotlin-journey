package com.curenosm.leetcode

class UglyNumber {
  class Solution {
    fun isUgly(n: Int): Boolean {
      val primeFactors = arrayOf(2, 3, 5)

      var n = n
      for (factor in primeFactors) while (n != 0 && n % factor == 0) n /= factor

      return n == 1
    }
  }
}
