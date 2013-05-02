package week1.chapter7

import scala.annotation.tailrec

object GCD {
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}