package com.curenosm.leetcode

class FindTheIntegerAddedToArrayI {
  class Solution {
    fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
      nums1.sort()
      nums2.sort()
      return nums2[0] - nums1[0]
    }
  }
}
