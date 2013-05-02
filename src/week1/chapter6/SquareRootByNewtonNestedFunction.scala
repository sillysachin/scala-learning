package week1.chapter6

object SquareRootByNewtonNestedFunction {
  def sqrt(x: Double): Double = {
    def abs(x: Double): Double = if (x < 0) -x else x

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double): Boolean = {
      abs((guess * guess) - x) / x < 0.0001
    }

    def improve(guess: Double, x: Double): Double = {
      println("Guess: " + guess)
      (guess + x / guess) / 2
    }
    sqrtIter(1, x)
  }
}