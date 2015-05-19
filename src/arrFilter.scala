object Solution {

  def f(delim:Int,arr:List[Int]):List[Int] = {
    //var list = arr.foreach(if _ < 3 ) :: Nil
    arr.filter(a => a<delim)
  }
  def main(args: Array[String]) {
	print(readLine)
    val arrFile = io.Source.fromFile("file")
	val arr = arrFile.getLines.toList.map(_.trim).map(_.toInt)
	val delim = arr(0)
	val list = arr.tail		

    f(delim,list).foreach(i => print(i))  }
}
