package com.curenosm.leetcode

class ClearDigits {
  class Solution {
    fun clearDigits(s: String): String {
      var (charsToRemove, i) = arrayOf(0, s.length - 1)
      val str = StringBuilder(s)

      while (i >= 0) {
        if (str[i].isDigit()) {
          str.deleteCharAt(i)
          charsToRemove += 1
        } else if (charsToRemove > 0) {
          str.deleteCharAt(i)
          charsToRemove -= 1
        }
        i -= 1
      }

      return str.toString()
    }
  }
}
