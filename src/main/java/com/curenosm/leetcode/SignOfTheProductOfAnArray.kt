package com.curenosm.leetcode

class SignOfTheProductOfAnArray {
  class Solution {
    fun arraySign(nums: IntArray): Int {
      return if (nums.indexOf(0) != -1) 0 else if (nums.count { it < 0 } % 2 == 0) 1 else -1
    }
  }
}
