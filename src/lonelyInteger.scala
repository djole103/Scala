object LonelyInteger {
  def main(args: Array[String]) {
    readInt()
    var single = 0
    readLine.split(" ").map(_.toInt).foreach( (arg: Int) => single = arg ^ single )
    println(single)
  }
}
