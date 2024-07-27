package com.curenosm.leetcode

class NumberOfSegmentsInAString {
  class Solution {
    fun countSegments(s: String) = s.split("\\s".toRegex()).count { it.isNotEmpty() }
  }
}
