package week1.chapter6

object ScopeRules {
  val x = 0                                       //> x  : Int = 0
  def f(y: Int) = y + 1                           //> f: (y: Int)Int
  val result = {
    val x = f(3)
    x * x
  } + x                                           //> result  : Int = 16
}