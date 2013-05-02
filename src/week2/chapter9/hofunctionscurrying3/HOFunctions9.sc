package week2.chapter9.hofunctionscurrying3

object HOFunctions9 {
  //Higher Order functions and Currying Syntax
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)     //> sum: (f: Int => Int)(a: Int, b: Int)Int

  def id(x: Int): Int = x                         //> id: (x: Int)Int
  def cube(x: Int): Int = x * x * x               //> cube: (x: Int)Int
  def factorial(x: Int): Int = {
    if (x < 1) 1 else x * factorial(x - 1)
  }                                               //> factorial: (x: Int)Int

  //Consecutive Application of Currying
  sum(id)(1, 4)                                   //> res0: Int = 10
  sum(cube)(1, 4)                                 //> res1: Int = 100
  sum(factorial)(1, 4)                            //> res2: Int = 33
}