object Solution {

  def f(delim:Int,arr:List[Int]):List[Int] = {
    //var list = arr.foreach(if _ < 3 ) :: Nil
    arr.filter(a => a<delim)
  }
  def main(args: Array[String]) {
    val delim = readInt
    val arr = io.Source.stdin.getLines.toList.map(_.toInt)
    f(delim,arr)//.foreach(print)
  }
}