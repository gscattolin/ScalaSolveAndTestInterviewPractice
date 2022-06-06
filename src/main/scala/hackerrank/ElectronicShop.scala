package hackerrank

object ElectronicShop {

  def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {
      var max = -1
      keyboards.foreach(x=> drives.foreach(y=> if (x+y>max && x+y<=b) max=x+y else max))
      max
  }

  def main(args: Array[String]): Unit = {
    println(getMoneySpent(Array(3,1),Array(5,2,8),10))
  }
}
