package week2.chapter9.hofunctionscurrying2

object HOFunctions8 {
  //Tail Recursive Sum,Higher Order functions and Currying
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      def loop(a: Int, acc: Int): Int = {
        if (a > b) acc else loop(a + 1, f(a) + acc)
      }
      loop(a, 0)
    }
    sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int

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