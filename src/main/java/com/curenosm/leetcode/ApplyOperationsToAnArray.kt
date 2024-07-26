package com.curenosm.leetcode

class ApplyOperationsToAnArray {

  class Solution {
    private fun List<Int>.shiftZeros() = this.filter { it != 0 } + this.filter { it == 0 }

    fun applyOperations(nums: IntArray) =
      nums.indices
        .onEach { i ->
          if (i != nums.size - 1 && nums[i] == nums[i + 1]) {
            nums[i] *= 2
            nums[i + 1] = 0
          }
        }
        .map { nums[it] }
        .shiftZeros()
        .toIntArray()
  }
}
