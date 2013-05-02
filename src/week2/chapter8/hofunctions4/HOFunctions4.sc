package week2.chapter8.hofunctions4

object HOFunctions4 {
  //Tail Recursive Sum and Higher Order functions
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  } //> sum: (f: Int => Int, a: Int, b: Int)Int

  def id(x: Int): Int = x //> id: (x: Int)Int
  def cube(x: Int): Int = x * x * x //> cube: (x: Int)Int
  def factorial(x: Int): Int = {
    if (x < 1) 1 else x * factorial(x - 1)
  } //> factorial: (x: Int)Int

  def sumInts(a: Int, b: Int) = sum(id, a, b) //> sumInts: (a: Int, b: Int)Int
  def sumCubes(a: Int, b: Int) = sum(cube, a, b) //> sumCubes: (a: Int, b: Int)Int
  def sumFactorial(a: Int, b: Int) = sum(factorial, a, b)
  //> sumFactorial: (a: Int, b: Int)Int

  sumInts(1, 3) //> res0: Int = 6
  sumCubes(1, 3) //> res1: Int = 36
  sumFactorial(1, 3) //> res2: Int = 9
}