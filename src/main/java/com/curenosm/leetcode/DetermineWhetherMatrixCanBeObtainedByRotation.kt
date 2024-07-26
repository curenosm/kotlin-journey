package com.curenosm.leetcode

class DetermineWhetherMatrixCanBeObtainedByRotation {
  class Solution {

    private fun reflect(matrix: Array<IntArray>) =
      matrix.map { it.reversed().toIntArray() }.toTypedArray()

    private fun transpose(matrix: Array<IntArray>) =
      Array(matrix.size) { i -> IntArray(matrix.size) { j -> matrix[j][i] } }

    private fun rotate(mat: Array<IntArray>) = reflect(transpose(mat))

    fun equals(mat: Array<IntArray>, other: Array<IntArray>): Boolean {
      var matches = true

      outer@ for (i in mat.indices) for (j in mat.indices) if (mat[i][j] != other[i][j]) {
        matches = false
        break@outer
      }

      return matches
    }

    fun findRotation(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
      var transformed = mat
      var matches = equals(transformed, target)

      for (i in 1..4) {
        if (matches) return true
        transformed = rotate(transformed)
        matches = equals(transformed, target)
      }

      return false
    }
  }
}
