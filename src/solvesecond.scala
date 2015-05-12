object Solution {

    def main(args: Array[String]) {
        var str = io.Source.stdin.getLines().take(1).map(_.toString)
        println(str.getClass())
        str = str.map(_.toInt)
        str = str.sum()
            //  str.foreach {println}
      //  val T : Int = io.Source.stdin.getLines().take(1).map(_.toInt)
      //  for(a <- 1 to T){
       //     println(io.Source.stdin.getLines().take(1).parse(' ').map(_.toInt).sum())
      //  }            
    }
}

