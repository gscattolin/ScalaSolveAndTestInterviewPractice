package hackerrank

object plusMinus {

  def plusMinus(arr: Array[Int]) = {
    val v=arr.groupBy { case x if x < 0 => -1 case 0 => 0 case x if x > 0 => 1 }.map(x => (x._1, x._2.length))
    println( f"${v.getOrElse(1,0).toFloat/arr.length}%.6f")
    println( f"${v.getOrElse(-1,0).toFloat/arr.length}%.6f")
    println( f"${v.getOrElse(0,0).toFloat/arr.length}%.6f")
  }
  
}
