package hackerrank

object minMaxSum {
  def miniMaxSum(arr: Array[Int]): Unit = {
    val res=arr.map(_.toLong).combinations(arr.length-1).map(_.sum).foldLeft(Long.MaxValue, Long.MinValue) {
      case ((mn, mx), i) => (i min mn, i max mx)
    }
    print(s"${res._1} ${res._2}")
  }
}
