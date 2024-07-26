package com.curenosm.leetcode

class LuckyNumbersInAMatrix {
  class Solution {
    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
      val (m, n) = arrayOf(matrix.size, matrix.first().size)
      val rows = matrix.map { it.min() }
      val cols = (0 until n).map { col -> (0 until m).maxOfOrNull { matrix[it][col] } ?: -1 }

      return (0 until m)
        .flatMap { i ->
          (0 until n).flatMap { j ->
            val cur = matrix[i][j]
            if (cur == rows[i] && cur == cols[j]) listOf(cur) else listOf()
          }
        }
        .toList()
    }
  }
}
