package week2.chapter8.hofunctionsmapreduce

object HOFunctions6 {

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, Zero: Int)(a: Int, b: Int): Int = {
    if (a > b) Zero
    else combine(f(a), mapReduce(f, combine, Zero)(a + 1, b))
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, Zero: Int)(a: Int, b:
                                                  //|  Int)Int

  def sum(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x + y, 0)(a, b)
                                                  //> sum: (f: Int => Int)(a: Int, b: Int)Int
  def prod(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
                                                  //> prod: (f: Int => Int)(a: Int, b: Int)Int

  def factorial(n: Int) = prod(x => x)(1, n)      //> factorial: (n: Int)Int
}