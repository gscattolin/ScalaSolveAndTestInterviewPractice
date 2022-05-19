package hackerrank

object Editor {
  def Editor(s:String,instructions:Array[String]):Unit={
    def applyOp(sc:String,sh:String,op:String):(String,String)={
      var news=sc
      val o = op.split(' ').head.toInt
      var arg=""
      if(o!=4){
        arg=op.split(' ').tail(0)
      }
      o match {
        case 1 => news=sc +arg;
        case 3 =>  println(sc(arg.toInt-1))
        case 2 =>  news=sc.take(sc.length-arg.toInt);
        case 4 =>  news=sh
      }
      (news,sc)
    }
    if(instructions.nonEmpty){
      var history=s
      val tmp=applyOp(s,history,instructions.head)
      var sc=tmp._1
      history = tmp._2
      for (inst <- instructions.drop(1)){
        val res=applyOp(sc,history,inst)
        sc=res._1
        history=res._2
      }
    }

  }
}
