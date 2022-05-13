package hackerrank

object arrayManipulation {

  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    val tA=Array.fill(n)(0L)
    queries.foreach(ar=> {tA(ar(0)-1)+=ar(2); if (ar(1)<n) tA(ar(1)) -= ar(2)})
    tA.foldLeft((0L,0L)){
      (m,v) =>
        if (m._2+v>m._1) (m._2+v,m._2+v)
        else (m._1,m._2+v)
    }._1
  }


}
