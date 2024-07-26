package com.curenosm.leetcode

import kotlin.math.abs

class CountGoodTriplets {
  class Solution {

    private fun Triple<Int, Int, Int>.isGood(a: Int, b: Int, c: Int) =
      abs(this.first - this.second) <= a &&
        abs(this.second - this.third) <= b &&
        abs(this.first - this.third) <= c

    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int) =
      arr.indices
        .flatMap { i ->
          (i + 1 until arr.size).flatMap { j ->
            (j + 1 until arr.size).map { k -> Triple(arr[i], arr[j], arr[k]) }
          }
        }
        .count { it.isGood(a, b, c) }
  }
}
