package com.curenosm.leetcode

class CheckIfAllCharactersHaveEqualNumberOfOccurences {
  class Solution {
    fun String.frequency() = this.groupingBy { it }.eachCount()

    fun areOccurrencesEqual(s: String): Boolean {
      val freq = s.frequency()
      return freq.keys.all { freq[it] == freq[s.first()] }
    }
  }
}
