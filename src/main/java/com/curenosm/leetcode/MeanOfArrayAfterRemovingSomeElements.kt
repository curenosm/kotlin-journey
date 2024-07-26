package com.curenosm.leetcode

class MeanOfArrayAfterRemovingSomeElements {
  class Solution {
    fun trimMean(arr: IntArray): Double {
      var arr = arr
      arr.sort()
      val numElems = (0.05 * arr.size).toInt()
      val subArray = arr.copyOfRange(numElems, arr.size - numElems)
      return subArray.sum().toDouble() / subArray.size
    }
  }
}
