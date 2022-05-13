package hackerrank

object AreaPolygon {
  
  def sol2(coords: List[(Int, Int)]): Double = {
    val twoV = coords.take(2)
    val side = math.sqrt(math.pow(twoV.head._1 - twoV.last._1, 2) + math.pow(twoV.head._2 - twoV.last._2, 2))
    val apoth = side / (2 * math.tan(math.Pi / coords.length))
    (coords.length * side * apoth) / 2
  }

  def sol(coords: List[(Int, Int)]): Double = {
    (coords.last +: coords).sliding(2).map(x => {
      val v1 = x.head
      val v2 = x.last
      v1._1 * v2._2 - v1._2 * v2._1
    }
    ).sum.abs / 2
  }
}
