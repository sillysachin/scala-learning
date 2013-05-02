package week2.chapter8.hofunctionsproduct

object HOFunctions5 {
  def prod(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * prod(f)(a + 1, b) //> prod: (f: Int => Int)(a: Int, b: Int)Int

  prod(x => x)(1, 3) //> res0: Int = 6
  prod(x => x * x)(1, 3) //> res1: Int = 36

  def factorial(n: Int) = prod(x => x)(1, n) //> factorial: (n: Int)Int
  factorial(3) //> res2: Int = 6
}