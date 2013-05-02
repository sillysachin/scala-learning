package week1.chapter6

object SquareRootByNewtonScopeRules {
  def sqrt(x: Double): Double = {
    def abs(x: Double): Double = if (x < 0) -x else x

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean = {
      abs((guess * guess) - x) / x < 0.0001
    }
    def improve(guess: Double): Double = {
      println("Guess: " + guess)
      (guess + x / guess) / 2
    }
    sqrtIter(1)
  }
}