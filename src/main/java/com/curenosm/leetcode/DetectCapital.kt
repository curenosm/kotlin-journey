package com.curenosm.leetcode

class DetectCapital {
  class Solution {
    fun detectCapitalUse(word: String) = word.matches("[A-Z]?([A-Z]+|[a-z]+)".toRegex())
  }
}
