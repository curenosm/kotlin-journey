package com.curenosm.leetcode

class SumOfSquaresOfSpecialNumbers {
  class Solution {
    fun sumOfSquares(nums: IntArray) =
      (1..nums.size).filter { nums.size % it == 0 }.map { nums[it - 1] }.sumOf { it * it }
  }
}
