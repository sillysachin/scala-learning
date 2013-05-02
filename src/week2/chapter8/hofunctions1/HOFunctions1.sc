package week2.chapter8.hofunctions1

object HOFunctions1 {
  //Example case for High Order functions

  def id(x: Int): Int = x                         //> id: (x: Int)Int
  def cube(x: Int): Int = x * x * x               //> cube: (x: Int)Int
  def factorial(x: Int): Int = {
    if (x < 1) 1 else x * factorial(x - 1)
  }                                               //> factorial: (x: Int)Int

  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0 else id(a) + sumInts(a + 1, b)
  }                                               //> sumInts: (a: Int, b: Int)Int
  def sumCubes(a: Int, b: Int): Int = {
    if (a > b) 0 else cube(a) + sumCubes(a + 1, b)
  }                                               //> sumCubes: (a: Int, b: Int)Int
  def sumFactorial(a: Int, b: Int): Int = {
    if (a > b) 0 else factorial(a) + sumFactorial(a + 1, b)
  }                                               //> sumFactorial: (a: Int, b: Int)Int

  sumInts(1, 3)                                   //> res0: Int = 10
  sumCubes(1, 4)                                  //> res1: Int = 100
  sumFactorial(1, 4)                              //> res2: Int = 33
}