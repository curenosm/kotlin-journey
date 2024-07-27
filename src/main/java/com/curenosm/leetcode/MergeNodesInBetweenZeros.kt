package com.curenosm.leetcode

class MergeNodesInBetweenZeros {

  data class ListNode(var `val`: Int, var next: ListNode? = null)

  class Solution {
    fun mergeNodes(head: ListNode?): ListNode? {
      var (result, l, r) = arrayOf(head, head, head)

      while (l != null) {
        var sum = 0
        r = l.next

        while (r != null) {
          if (r.`val` == 0) {
            r.`val` = sum
            l.next = r
            break
          } else {
            sum += r.`val`
            r = r.next
          }
        }

        l = l.next
      }

      return head?.next
    }
  }
}
