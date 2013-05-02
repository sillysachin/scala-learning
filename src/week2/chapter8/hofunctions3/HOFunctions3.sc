package week2.chapter8.hofunctions3

object HOFunctions3 {
  //Anonymous functions with Higher Order functions
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b) //> sum: (f: Int => Int, a: Int, b: Int)Int

  def factorial(x: Int): Int = if (x < 1) 1 else x * factorial(x - 1)
  //> factorial: (x: Int)Int

  def sumInts(a: Int, b: Int) = sum(x => x, a, b) //> sumInts: (a: Int, b: Int)Int
  def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)
  //> sumCubes: (a: Int, b: Int)Int
  def sumFactorial(a: Int, b: Int) = sum(x => { if (x < 1) 1 else x * factorial(x - 1) }, a, b)
  //> sumFactorial: (a: Int, b: Int)Int

  sumInts(1, 4) //> res0: Int = 10
  sumCubes(1, 4) //> res1: Int = 100
  sumFactorial(1, 4) //> res2: Int = 33
}