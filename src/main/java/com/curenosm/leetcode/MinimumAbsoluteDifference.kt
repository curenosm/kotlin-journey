package com.curenosm.leetcode

import kotlin.math.abs
import kotlin.math.min

class MinimumAbsoluteDifference {
  class Solution {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
      val arr = arr
      arr.sort()
      var minVal = Int.MAX_VALUE
      return (0 until arr.size - 1)
        .onEach { i -> minVal = min(minVal, abs(arr[i] - arr[i + 1])) }
        .map { i -> listOf(arr[i], arr[i + 1]) }
        .filter { abs(it.first() - it.last()) == minVal }
    }
  }
}
