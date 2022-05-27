package hackerrank

object JimSkyScrapers {
  def solveMap(arr: Array[Int]): Int = {
   var res=scala.collection.mutable.Map[Int,Int]()
    var goodRoute =0
    for (cand <- arr) {
      res = res.filter(x => x._1 >= cand)
      res.updateWith(cand) {
        case Some(n) =>goodRoute += n ; Some(n + 1)
        case None => Some(1)
      }
    }
    goodRoute*2
  }

  def solve(arr: Array[Int]): Int = {
    val res=scala.collection.mutable.Stack[(Int,Int)]()
    var valid =0
    for (v <- arr) {
      while (res.nonEmpty && res.head._1<v)
        res.pop()
      if (res.nonEmpty && res.head._1==v){
        valid += res.head._2
        val a1=res.head._1
        val a2=res.head._2+1
        res.pop()
        res.push((a1,a2))
      }else{
        res.push((v,1))
      }
    }
    valid*2
  }

  def main(args: Array[String]): Unit = {
    println(solve(Array(3 ,2, 1, 2, 3, 3))==8)
    println(solve(Array(1,1000,1))==0)
  }
}
