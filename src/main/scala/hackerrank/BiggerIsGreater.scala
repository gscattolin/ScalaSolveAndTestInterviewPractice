package hackerrank

object BiggerIsGreater {
//  def biggerIsGreater(w: String): String = {
//      // Write your code here
//    def swapString(s:String,o:Int,t:Int):String={
//        val lst=s.toArray
//        val c=lst(o)
//        lst(o)=lst(t)
//        lst(t)=c
//        lst.mkString("")
//    }
//    var found =false
//    var starting:Int = w.length-1
//    while (!found){
//      for (t <- 0 to starting){
//        if (t>swapString(w,starting,t))
//      }
//    }
//  }
  import cats._
  import cats.implicits._
  import cats.Semigroup
  import cats.data.{ NonEmptyList, OneAnd, Validated, ValidatedNel }

  def parseIntEither(s: String): Either[NumberFormatException, Int] =
    Either.catchOnly[NumberFormatException](s.toInt)

  def parseIntValidated(s: String): ValidatedNel[NumberFormatException, Int] =
    Validated.catchOnly[NumberFormatException](s.toInt).toValidatedNel

  def main(args: Array[String]): Unit = {
    def parseInt(s: String): Option[Int] =
      Either.catchOnly[NumberFormatException](s.toInt).toOption

    val a1 = Foldable[List].traverse_(List("1", "2", "3"))(parseInt)
    val a2 = Foldable[List].traverse_(List("a", "b", "c"))(parseInt)

    val FoldableListOption = Foldable[List].compose[Option]
    val a3=FoldableListOption.fold(List(Option(1), Option(2), Option(3), Option(4)))
    val a4=FoldableListOption.fold(List(Option("1"), Option("2"), None, Option("3")))
    val a5=Foldable[List].isEmpty(List(1, 2, 3))
    val a6: List[Int] = Foldable[List].dropWhile_(List(1, 2, 3))(_ < 2)
    val a7: List[Int]=Foldable[List].takeWhile_(List(1, 2, 3))(_ < 2)
    val a8=List("1", "2", "3").traverse(parseIntEither)
    val a9=List("1", "abc", "3").traverse(parseIntEither).isLeft
    println("END")
  }
}
