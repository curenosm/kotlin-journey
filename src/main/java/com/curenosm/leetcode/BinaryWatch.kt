package com.curenosm.leetcode

class BinaryWatch {
  class Solution {

    private fun Int.bitCount() = Integer.toBinaryString(this).count { it == '1' }

    private fun Pair<Int, Int>.sum() = this.first + this.second

    private fun Pair<Int, Int>.toFormattedHour() =
      "${this.first}:${this.second.toString().padStart(2, '0')}"

    private fun Pair<Int, Int>.generateCombinations() =
      (0..11).flatMap { hours ->
        (0..59).flatMap { minutes ->
          val (hh, mm) = arrayOf(Int.MAX_VALUE and hours, Int.MAX_VALUE and minutes)

          if (this.first == hh.bitCount() && this.second == mm.bitCount()) listOf(hours to minutes)
          else emptyList()
        }
      }

    fun readBinaryWatch(turnedOn: Int) =
      (0..4)
        .flatMap { h -> (0..6).map { m -> h to m } }
        .filter { turnedOn == it.sum() }
        .flatMap { it.generateCombinations() }
        .map { it.toFormattedHour() }
  }
}
