package hackerrank

object birthdayCandles {
  def birthdayCakeCandles(candles: Array[Int]): Int = {
    candles.count(x=> x==candles.max)

  }
}
