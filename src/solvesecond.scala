object Solution {
    def main(args: Array[String]) {
        val n = readInt()
        for (i <- 1 to n) {
            var nums = readLine.split(" ")
            var num  = nums(0).toInt + nums(1).toInt
            println(num)
        }
    }
}

object Solution2 {
    def main(args: Array[String]): Unit = {
        val n = readInt()
        (1 to n).map(i => readLine.split(" ").map(_.toInt).sum).foreach(println)
    }
}