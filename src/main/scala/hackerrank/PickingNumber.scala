package hackerrank

object PickingNumber {

  def pickingNumbers(a: Array[Int]): Int = {
    var res:List[Int]=List[Int]()
    for (st <- a )
      {
        val tt=List(st,st-1)
        val maxLst=a.filter(x=> tt.contains(x))
        if (maxLst.length>res.length) res=maxLst.toList
      }
      res.length

  }


  def main(args: Array[String]): Unit = {
  println(pickingNumbers(Array(4,6,5,3,3,1)))
  }

}
