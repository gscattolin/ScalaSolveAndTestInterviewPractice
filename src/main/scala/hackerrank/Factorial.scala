package hackerrank

import scala.annotation.tailrec

object Factorial {

  def f(n:Int):BigInt={
    n match {
      case 1 => 1
      case n => n*f(n-1)
    }
  }

  @tailrec
  def factorial(n:Int,value:BigInt=1):BigInt={
    n match {
      case 1 => value
      case n => factorial(n-1,value*n)
    }
  }

  def main(args: Array[String]): Unit = {
    println(factorial(25))
  }
}
