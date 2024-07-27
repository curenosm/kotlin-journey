package com.curenosm.leetcode

class CheckIfAStringIsAndAcronymOfWords {
  class Solution {
    fun isAcronym(words: List<String>, s: String) =
      s == words.map { it[0] }.joinToString(separator = "")
  }
}
