package week1.chapter3

object SubstitutionCBVvsCBN {
  def loop: Int = loop                            //> loop: => Int
  def firstCBV(x: Int, y: Int) = x                //> firstCBV: (x: Int, y: Int)Int/
  firstCBV(1,loop)
  
  //firstCBV does not terminate when loop argument value supplied to CBV argument.
  def firstCBN(x: => Int, y: => Int) = x
  firstCBN(1, loop)

  def constOne(x: Int, y: => Int) = 1
  constOne(1 + 2, loop)
  constOne(loop, 1+2)
  //constOne does not terminate when loop is argument value supplied to CBV argument.
}