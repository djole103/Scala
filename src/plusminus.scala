import scala.io._
object Solution {
  def main(args: Array[String]) = {
    val size = StdIn.readInt()
    var positives : Double = 0;
    var negatives : Double = 0;
    var zeros : Double = 0;

    for(i <- StdIn.readLine().split(" ")) {
      val n = Integer.parseInt(i)
      if (n > 0)
        positives += 1
      else if(n < 0)
        negatives += 1
      else
        zeros += 1
    }

    println(positives / size)
    println(negatives / size)
    println(zeros / size)
  }
}
