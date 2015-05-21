object ArrayBirth {
	def main(args: Array[String]) {
		println(f3(3))
	}

	def f(num : Int) : List[Int] = {
		(1 to num).toList
	}

	//bad 
	def f2(num : Int) : List[Int] = {
		var nums: List[Int] = List()
		(1 to num).foreach(
		e => nums = nums.:+(e)
		)
		nums
	}

	def f3(num : Int) : scala.collection.mutable.Buffer[Int] = {
		var outList = scala.collection.mutable.Buffer[Int]()
		for(i<- 1 to num) outList += i
		outList
	}

	def f4(num : Int) : List[Int] = {
		val orgList = List(1,2,3)
		val list2add = (1 to num).toList
		val newList = orgList ++ list2add
		val newList2 = orgList ++ list2add.map(_ * 2)
		val newList3 = orgList ++ {for(x <- list2add) yield 2*x}
	}

	def addAll(toList: List[Int], fromList: List[Int]): List[Int] =
	  fromList match{
		case x :: tail => addAll(2*x :: toList, tail)
		case Nil => toList
	}	


}

