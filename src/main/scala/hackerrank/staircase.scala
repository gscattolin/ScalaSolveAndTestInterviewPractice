package hackerrank

object staircase {
  
  def sol(n: Int):Unit= {
    (1 to n).foreach(x=> {print(" "* (n-x)); println("#"*x)})

  }
}
