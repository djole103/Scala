//my ugly attempt doesn't work
object ListReplicator {

    def main(args: Array[String]) {
        val rep = readInt
        var l : List[Int] = List()
        var tmp = readInt
        while(tmp!= null){
             l.:+(tmp)
             tmp = readInt
        }
        f(rep,l)
    }
    
     def f(num:Int,arr:List[Int]):List[Int] = {
        var ll : List[Int] = List() 
        var l = arr.foreach((1 to num).foreach(ll.:+(_)))
     }
}

// a solution
object Solution extends App {
  def f(num:Int,arr:List[Int]):List[Int] = {
    arr.flatMap(e => List.fill(num)(e))
  }

  def displayResult(arr:List[Int]) = println(f(arr(0).toInt,arr.drop(1)).map(_.toString).mkString("\n"))

  displayResult(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt))


}