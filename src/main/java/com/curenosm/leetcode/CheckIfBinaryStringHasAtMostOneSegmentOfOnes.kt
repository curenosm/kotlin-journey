package com.curenosm.leetcode

class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
  class Solution {
    fun checkOnesSegment(s: String) = s.split("0+".toRegex()).filter { it.isNotEmpty() }.size <= 1
  }
}
