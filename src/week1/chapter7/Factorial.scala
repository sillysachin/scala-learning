package week1.chapter7

import scala.annotation.tailrec

object Factorial {
  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }

  def talRecFactorial(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int = {
      if (n < 1) acc
      else loop(acc * n, n - 1)
    }
    loop(1, n)
  }
}