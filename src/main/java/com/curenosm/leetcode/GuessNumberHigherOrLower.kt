package com.curenosm.leetcode

/**
 *     l ------------ m ---------------- r    1
 *       ------------ l ------- m ------ r   -1
 *       ------------ l -- m -- r ------     -1
 *                    .
 *                    .
 *                    .
 */
class GuessNumberHigherOrLower {

  abstract class GuessGame {
    fun guess(m: Int): Int {
      return 0
    }

    abstract fun guessNumber(n: Int): Int
  }

  /**
   * The API guess is defined in the parent class.
   *
   * @param num your guess
   * @return -1 if num is higher than the picked number 1 if num is lower than the picked number
   *   otherwise return 0 fun guess(num:Int):Int {}
   */
  class Solution : GuessGame() {

    private fun midpoint(l: Long, r: Long): Long {
      val m = (l + r) / 2
      return if (m == l) m + 1 else m
    }

    override fun guessNumber(n: Int): Int {
      var (l, r, m) = arrayOf(0L, n.toLong(), midpoint(0, n.toLong()))
      var guess = super.guess(m.toInt())

      while (guess != 0) {
        when {
          (guess > 0) -> l = m
          else -> r = m
        }
        m = midpoint(l, r)
        guess = super.guess(m.toInt())
      }

      return m.toInt()
    }
  }
}
