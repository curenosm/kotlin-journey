package com.curenosm.leetcode

import kotlin.math.abs

class FindAllNumbersDisappearedInAnArray {
  class Solution {
    fun findDisappearedNumbers(nums: IntArray) =
      nums.indices
        .onEach {
          val cur = abs(nums[it]) - 1
          nums[cur] *= if (nums[cur] > 0) -1 else 1
        }
        .filter { nums[it] > 0 }
        .map { it + 1 }
  }
}
