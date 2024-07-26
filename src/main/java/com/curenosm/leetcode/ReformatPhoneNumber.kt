package com.curenosm.leetcode

class ReformatPhoneNumber {
  class Solution {
    fun reformatNumber(number: String): String {
      val number = number.replace("[-\\s]".toRegex(), "")
      val groups = number.chunked(3).toTypedArray()
      val n = groups.size

      if (groups.last().length == 1) {
        groups[n - 1] = groups[n - 2].last() + groups[n - 1]
        groups[n - 2] = groups[n - 2].substring(0, groups[n - 2].length - 1)
      }

      return groups.joinToString("-")
    }
  }
}
