package com.curenosm.leetcode

class CheckIfTwoStringArraysAreEquivalent {
  class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>) =
      word1.joinToString("") == word2.joinToString("")
  }
}
