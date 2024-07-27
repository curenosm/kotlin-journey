package com.curenosm.leetcode

class SubArraysDistinctElementSumOfSquaresI {
  class Solution {
    private fun Int.square() = this * this

    fun sumCounts(nums: List<Int>) =
      nums.indices
        .flatMap { i ->
          (i + 1..nums.size).map { j -> nums.subList(i, j).distinct().count().square() }
        }
        .sum()
  }
}
