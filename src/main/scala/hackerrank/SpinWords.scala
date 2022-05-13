package hackerrank

object SpinWords {
  
  def sol(sentence: String): String = {
    val strb = new StringBuilder
    for (x <- sentence.split("\\s+")) {
      val vv = if (x.length >= 5) x.reverse else x
      strb.append(vv)
      strb.append(" ")
    }
    strb.toString().strip()
  }

}
