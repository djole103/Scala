object ArrayBirth {
	def maint() {
		f3(3)
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

	def f3(num : Int) : List[Int] = {
		var outList = scala.collection.mutable.Buffer[Int]()
		for(i<-num) outList += i
		outList
	}


}
