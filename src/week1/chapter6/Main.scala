package week1.chapter6

object Main extends App {
  import SquareRootByNewtonNestedFunction.sqrt
  println("Calculating Square Root for 3 - " + sqrt(3));
  println("Calculating Square Root for 0.001 - " + sqrt(0.001));
  println("Calculating Square Root for 0.1e-20 - " + sqrt(0.1e-20));
  println("Calculating Square Root for 1.0e20 - " + sqrt(1.0e20));
  println("Calculating Square Root for 1.0e50 - " + SquareRootByNewtonScopeRules.sqrt(1.0e50));
}