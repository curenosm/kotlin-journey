package com.curenosm.leetcode

import kotlin.math.abs

class PermutationDifferenceBetweenTwoStrings {
  class Solution {
    fun findPermutationDifference(s: String, t: String) =
      (s.indices).sumOf { i -> abs(s.indexOf(s[i]) - t.indexOf(s[i])) }
  }
}
