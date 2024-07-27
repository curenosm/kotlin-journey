package com.curenosm.leetcode

class SumOfAllSubsetXorTotals {
  class Solution {
    private fun findAllSubsetsFrom(nums: IntArray): MutableSet<IntArray> {
      when (nums.size) {
        0 -> return mutableSetOf<IntArray>()
        1 -> return mutableSetOf(nums)
        else -> Unit
      }

      val others = findAllSubsetsFrom(nums.copyOfRange(1, nums.size))
      val subsets = mutableSetOf(intArrayOf(nums.first()))
      subsets.addAll(others + others.map { it + nums.first() })
      return subsets
    }

    fun subsetXORSum(nums: IntArray) =
      findAllSubsetsFrom(nums).sumOf { it.reduce { acc, cur -> acc xor cur } }
  }
}
