package com.curenosm.leetcode

class MaximumValueOfAStringInAnArray {

  class Solution {

    private fun String.value() = this.toIntOrNull() ?: this.length

    fun maximumValue(strs: Array<String>) = strs.maxOfOrNull { it.value() } ?: -1
  }
}
