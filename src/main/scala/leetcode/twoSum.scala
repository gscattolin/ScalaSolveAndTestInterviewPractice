package leetcode

object twoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    import scala.collection.immutable.HashMap
    def run(index: Int, map: HashMap[Int, Int]): Array[Int] = {
      val value = nums(index)
      map get (target - value) match {
        case Some(foundInd) => Array(foundInd, index)
        case None => run(index + 1, map + (value -> index))
      }
    }
    run(0, HashMap())
  }
}
