package hackerrank

import scala.collection.LinearSeq
import scala.collection.Searching.Found

object ClimbingLeaderboard {

  def climbingLeaderboardStd(ranked: Array[Int], player: Array[Int]): Array[Int] = {
    def findPos(rank:Iterable[(Int,Int)],v:Int):Int={
      val r=rank.takeWhile(y=> y._1>=v)
      if (r.nonEmpty)
        if(r.last._1==v)  r.last._2
        else r.last._2+1
        else 1
    }
    def assignedRank(rank:Array[Int]):Iterable[(Int,Int)]= {
      var pos=1
      val res=scala.collection.mutable.ArrayBuffer[(Int,Int)]()
      for (p <- rank.indices){
        p match {
          case 0 => res +=  rank(0) ->pos
          case v if rank(v)!=rank(v-1) => pos +=1; res += rank(p)-> pos
          case _ =>
        }
      }
      res
    }
//    val rank1=ranked.toSet.toList.sorted(Ordering[Int].reverse).zipWithIndex
    val rank=assignedRank(ranked)
    player.map(x=>findPos(rank,x))
    
  }

  def climbingLeaderboard(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val score2 = scores.distinct
    val length = score2.length-1
    var j = length

    for(i:Int <- alice) yield {
      val cond =  score2.search[Int](i)(Ordering[Int].reverse) match {
        case Found(foundIndex) => foundIndex
        case _ => -1
      }
      if(cond != -1) {
        cond +1
      } else if(score2(length) > i) {
        length +2
      } else if (score2(0) < i) {
        1
      } else {
        while (score2(j)<i) {
          j -=1
        }
        j+2
      }
    }

  }

  def main(args: Array[String]): Unit = {
    println(climbingLeaderboard(Array(100,90,90,80,75,60),Array(50,65,77,90,102)).mkString(",")=="6,5,4,2,1")
    println(climbingLeaderboard(Array(100,100,50,40,40,20,10),Array(5,25,50,120)).mkString(",")=="6,4,2,1")
  }

}
