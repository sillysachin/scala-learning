package week1.chapter2

object REPLIntro {
  1 + 1                                           //> res0: Int(2) = 2
  def pi = 3.14                                   //> pi: => Double
  pi * 3 * 3                                      //> res1: Double = 28.259999999999998
  def radius = 3                                  //> radius: => Int
  def area(r: Double) = pi * r * r                //> area: (r: Double)Double
  area(3)                                         //> res2: Double = 28.259999999999998
  def square(x: Double) = x * x                   //> square: (x: Double)Double
  square(2)                                       //> res3: Double = 4.0
  def areaUsingSquare(r: Double) = pi * square(r) //> areaUsingSquare: (r: Double)Double
  areaUsingSquare(3)                              //> res4: Double = 28.26
  def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
                                                  //> sumOfSquares: (x: Double, y: Double)Double
  sumOfSquares(2, 3)                              //> res5: Double = 13.0
}