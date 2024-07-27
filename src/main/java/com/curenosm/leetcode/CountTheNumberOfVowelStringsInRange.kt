package com.curenosm.leetcode

class CountTheNumberOfVowelStringsInRange {
  class Solution {
    private val VOWELS = listOf('a', 'e', 'i', 'o', 'u')

    fun vowelStrings(words: Array<String>, left: Int, right: Int) =
      (left..right)
        .map { words[it] }
        .filter { VOWELS.contains(it.first()) }
        .count { VOWELS.contains(it.last()) }
  }
}
