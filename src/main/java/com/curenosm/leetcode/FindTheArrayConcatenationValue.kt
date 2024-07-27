package com.curenosm.leetcode

class FindTheArrayConcatenationValue {
  class Solution {
    private fun IntArray.mid() = (this.size - 1) / 2

    fun findTheArrayConcVal(nums: IntArray) =
      (0..nums.mid())
        .map { l ->
          if (l == nums.mid() && nums.size % 2 == 1) "${nums[l]}"
          else "${nums[l]}${nums[nums.size - 1 - l]}"
        }
        .onEach { println(it) }
        .sumOf { it.toLong() }
  }
}
