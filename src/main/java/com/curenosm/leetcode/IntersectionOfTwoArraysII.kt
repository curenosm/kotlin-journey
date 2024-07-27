package com.curenosm.leetcode

import kotlin.math.min

class IntersectionOfTwoArraysII {
  class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray) =
      nums1
        .toSet()
        .intersect(nums2.toSet())
        .associateWith { key ->
          min(nums1.filter { it == key }.count(), nums2.filter { it == key }.count())
        }
        .toMutableMap()
        .entries
        .flatMap { (k, v) -> (0 until v).map { k } }
        .toIntArray()
  }
}
