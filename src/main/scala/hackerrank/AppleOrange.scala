package hackerrank

import scala.annotation.tailrec

object AppleOrange {

  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]):Unit ={
    println(apples.count(p=> a+p>=s && a+p<=t))
    println(oranges.count(p=> b+p>=s && b+p<=t))
  }



  def main(args: Array[String]): Unit = {
   countApplesAndOranges(5,15,3,2,Array(-2,2,1),Array(5,-6))
  }


  }
