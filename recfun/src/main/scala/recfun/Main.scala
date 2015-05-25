package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
		if( c == 1 || c == r) 1
		else pascal(c,r-1) + pascal(c-1,r-1)

	}
		
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
	count = 0
	def loop(chars: List[Char],count: Int) : Boolean = {
		if chars.isEmpty && count==0 True 
		elif chars.head == '(' loop(chars.tail,count+1)
		elif chars.head == ')' closedB(chars, count-1)
		else loop(chars.tail,count)
	}
	def closedB(chars: List[Char], count: Int) : Boolean = {
		if count<0 False
		else loop(chars.tail,count)
	}
	loop(chars,count)
  }
  

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
