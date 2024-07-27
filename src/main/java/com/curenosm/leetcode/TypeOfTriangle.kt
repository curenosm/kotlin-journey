package com.curenosm.leetcode

class TypeOfTriangle {
  class Solution {
    private fun isTriangle(a: Int, b: Int, c: Int) = a + b > c && b + c > a && c + a > b

    fun triangleType(nums: IntArray) =
      if (isTriangle(nums[0], nums[1], nums[2]))
        when (nums.toSet().size) {
          1 -> "equilateral"
          2 -> "isosceles"
          3 -> "scalene"
          else -> "none"
        }
      else "none"
  }
}
