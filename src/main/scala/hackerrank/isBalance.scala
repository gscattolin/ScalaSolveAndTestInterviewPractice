package hackerrank

import scala.collection.mutable

object isBalance {

  def isBalancedRecursive(s: String): String = {
    def getOpen(a:Char):Char={
      a match {
        case  '}'=>'{'
        case  ']'=>'['
        case ')' =>'('
        case _ => throw IllegalArgumentException()
      }
    }

    val open=Set('{','[','(')
    val close=Set('}',']',')')
    def checkBalance(s:String,brackets:mutable.Stack[Char]):Boolean={
      if (s.length<1) brackets.isEmpty
      else{
        val c=s(0)
        if (open.contains(c)) {
          brackets.push(c)
          checkBalance(s.drop(1),brackets)
        }
        else if (close.contains(c) && brackets.head==getOpen(c)){
          brackets.pop()
          checkBalance(s.drop(1),brackets)
        } else
        {
          false
        }
      }

    }
    if (checkBalance(s,mutable.Stack[Char]())) "YES"else "NO"
  }
}
