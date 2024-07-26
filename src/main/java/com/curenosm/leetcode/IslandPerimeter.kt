package com.curenosm.leetcode

class IslandPerimeter {
  class Solution {

    enum class Direction(val x: Int, val y: Int) {
      UP(0, 1),
      RIGHT(1, 0),
      DOWN(0, -1),
      LEFT(-1, 0),
    }

    private fun Array<IntArray>.inBounds(row: Int, col: Int) =
      (row in indices) && (col in 0 until this[0].size)

    private fun Array<IntArray>.side(dir: Direction, row: Int, col: Int): Int {
      val (x, y) = arrayOf(row + dir.x, col + dir.y)
      return if (!this.inBounds(x, y) || this[row][col] != this[x][y]) 1 else 0
    }

    private fun Array<IntArray>.perimeter(row: Int, col: Int) =
      if (this[row][col] == 1)
        this.side(Direction.UP, row, col) +
          this.side(Direction.RIGHT, row, col) +
          this.side(Direction.DOWN, row, col) +
          this.side(Direction.LEFT, row, col)
      else 0

    fun islandPerimeter(grid: Array<IntArray>) =
      grid.indices.flatMap { i -> (0 until grid[0].size).map { j -> grid.perimeter(i, j) } }.sum()
  }
}
