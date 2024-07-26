package com.curenosm.leetcode

class SumOfUniqueElements {
  class Solution {
    private fun IntArray.frequency() = this.toTypedArray().groupingBy { it }.eachCount()

    fun sumOfUnique(nums: IntArray) = nums.frequency().filter { it.value == 1 }.map { it.key }.sum()
  }
}
