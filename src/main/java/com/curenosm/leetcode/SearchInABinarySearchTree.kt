package com.curenosm.leetcode

class SearchInABinarySearchTree {

  class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null) {}

  class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? =
      if (root == null) null
      else
        when {
          root.`val` > `val` -> searchBST(root.left, `val`)
          root.`val` < `val` -> searchBST(root.right, `val`)
          else -> root
        }
  }
}
