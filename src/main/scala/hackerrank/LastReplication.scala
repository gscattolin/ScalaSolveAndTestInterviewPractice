package hackerrank

import scala.collection.mutable.ListBuffer

object LastReplication {
  def ListReplication(num: Int, arr: List[Int]): List[Int] = {
    val lst = new ListBuffer[Int]()
    arr.foreach(x => lst ++= ListBuffer.fill(num)(x))
    lst.toList
  }
}
