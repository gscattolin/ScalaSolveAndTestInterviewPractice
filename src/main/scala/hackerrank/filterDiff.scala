package hackerrank

object filterDiff {

  def fpFiltArarray(delim: Int, arr: List[Int]): List[Int] = {
    arr.filter(x => x < delim)
  }

  def fpFilterPositionsInList(arr: List[Int]): List[Int] = {
    arr.zipWithIndex.collect({ case (x, ind) if ind % 2 == 0 => x })
  }

  def fpFilterPositionsInListDiff(arr: List[Int]): List[Int] = {
    for {
      (x, i) <- arr.zipWithIndex
      if i % 2 == 1
    } yield x
  }
  
}
