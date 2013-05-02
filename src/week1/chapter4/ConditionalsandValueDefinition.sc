package week1.chapter4

object ConditionalsandValueDefinition {
  def abs(x: Int) = if (x >= 0) x else -x         //> abs: (x: Int)Int
  abs(-4)                                         //> res0: Int = 4
  abs(4)                                          //> res1: Int = 4

  def square(x: Double) = x * x                   //> square: (x: Double)Double
  val x = 2                                       //> x  : Int = 2
  val y = square(x)                               //> y  : Double = 4.0

  def loop: Boolean = loop                        //> loop: => Boolean
  def a = loop                                    //> a: => Boolean
  //val b = loop
  //val declaration of b will lead to an infinite loop.

  //AND Implementation using only if else return
  def and(x: Boolean, y: Boolean): Boolean = if (x) y else false
                                                  //> and: (x: Boolean, y: Boolean)Boolean
  and(true, true)                                 //> res2: Boolean = true
  and(true, false)                                //> res3: Boolean = false
  and(false, false)                               //> res4: Boolean = false
  and(false, true)                                //> res5: Boolean = false

  //and(true, loop)
  //loop leads to infinite execution of and() evaluation which can be avoided.
  def andCBN(x: Boolean, y: => Boolean): Boolean = if (x) y else false
                                                  //> andCBN: (x: Boolean, y: => Boolean)Boolean
  andCBN(false, loop)                             //> res6: Boolean = false
  //andCBN(true, loop)
  //Infinite execution Cannot be avoided?
  //andCBN(loop, false)
  //Infinite execution Cannot be avoided?
  //andCBN(loop, true)
  //Infinite execution Cannot be avoided?

  //OR Implementation using only if else return
  def or(x: Boolean, y: Boolean): Boolean = {
    if (x) return true
    if (y) return true
    else false
  }                                               //> or: (x: Boolean, y: Boolean)Boolean
  or(true, true)                                  //> res7: Boolean = true
  or(true, false)                                 //> res8: Boolean = true
  or(false, false)                                //> res9: Boolean = false
  or(false, true)                                 //> res10: Boolean = true
  //or(true, loop)
  //loop leads to infinite execution of or() evaluation which can be avoided.
  def orCBN(x: Boolean, y: => Boolean): Boolean = {
    if (x) return true
    if (y) return true
    else false
  }                                               //> orCBN: (x: Boolean, y: => Boolean)Boolean
  orCBN(true, loop)                               //> res11: Boolean = true
  //orCBN(loop, true)
  //Infinite execution Cannot be avoided?
  //orCBN(false, loop)
  //Infinite execution Cannot be avoided?
  //orCBN(loop, false)
  //Infinite execution Cannot be avoided?
}