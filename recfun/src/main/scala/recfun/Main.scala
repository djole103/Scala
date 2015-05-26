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
  def countChange(money: Int, coins: List[Int]): Int = {
	//have a "count" which is the money you've chosen so far
	//for each coin (use it as a base, like a first choice)
	//pass it to a function adding that val to count more possibilities
	// eg. list.map(count + _ , list, valGoal)
	//return when you equal the value, if it goes over it doesn't count

	//V2 NEW PLAN
	//pass in coins and money, try all possibilities in coins reducing "money" to 0
	//make list of lists then use List().distinct to count how many ways
	def loop(money: Int, coins: List[Int],
  }
}
