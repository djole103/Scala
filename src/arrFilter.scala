object ArrayFilter {

    def f(delim:Int,arr:List[Int]):List[Int] = {
        var list = arr.foreach(if _ < 3 ) :: Nil
    }
    def main(args: Array[String]) {
       val delim = readInt
       val arr = io.readLines.map(_.toInt)
       f(delim,arr).foreach(print)
    }
}
