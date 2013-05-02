package week1.chapter5

object SquareRootByNewton {
  def abs(x: Double): Double = if (x < 0) -x else x

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnoughImproved(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double): Boolean = {
    abs((guess * guess) - x) < 0.0001
  }

  def isGoodEnoughImproved(guess: Double, x: Double): Boolean = {
    abs((guess * guess) - x) / x < 0.0001
  }

  def improve(guess: Double, x: Double): Double = {
    println("Guess: " + guess)
    (guess + x / guess) / 2
  }

  def sqrt(x: Double): Double = sqrtIter(1, x)
}