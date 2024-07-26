package com.curenosm.leetcode

class FindTheHighestAltitude {
  class Solution {
    fun largestAltitude(gain: IntArray): Int {
      val altitudes = IntArray(gain.size + 2)
      return (0..gain.size + 1)
        .onEach { i -> if (i in 1..gain.size) altitudes[i] = altitudes[i - 1] + gain[i - 1] }
        .map { altitudes[it] }
        .max()
    }
  }
}
