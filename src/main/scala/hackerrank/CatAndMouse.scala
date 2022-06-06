package hackerrank

object CatAndMouse {

  def catAndMouse(x: Int, y: Int, z: Int): String = {
    math.abs(z-x) - math.abs(z-y) match{
      case 0 => "Mouse C"
      case v if v>0 => "Cat B"
      case  v if v<0 => "Cat A"
    }

  }
  def main(args: Array[String]): Unit = {
    println(catAndMouse(1,2,3))
    println(catAndMouse(1,3,2))
  }


}
