package com.curenosm.leetcode

class FindMissingAndRepeatedValues {
  class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
      val (m, n) = arrayOf(grid.size, grid[0].size)
      val count = IntArray(m * n)

      for (i in 0 until m) for (j in 0 until n) count[grid[i][j] - 1] += 1

      return intArrayOf(
        ((0 until m * n).find { count[it] == 2 } ?: 0) + 1,
        ((0 until m * n).find { count[it] == 0 } ?: 0) + 1,
      )
    }
  }
}
