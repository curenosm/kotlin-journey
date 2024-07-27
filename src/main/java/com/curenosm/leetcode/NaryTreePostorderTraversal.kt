package com.curenosm.leetcode

class NaryTreePostorderTraversal {

  class Node(var `val`: Int?, var children: List<Node>) {}

  class Solution {
    fun postorder(root: Node?): List<Int> {
      return helper(root, mutableListOf<Int>())
    }

    private fun helper(root: Node?, result: MutableList<Int>): List<Int> {
      if (root == null) return result

      for (child in root.children) helper(child, result)
      root.`val`?.let { result.add(it) }

      return result
    }
  }
}
