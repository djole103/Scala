//tail recursive means the function's last call is to a function and this
//evaluates to the return of the function
//the implication of this is that the stack is constant, meaning you avoid overflow
//this should be implemented where long recursive steps may happen
//you can enforce this with @tailrec

object tailrec {

//tail recursive
	def gcd(a: Int, b: Int) Int =
		if(b == 0) a else gcd(b, a % b)

//not tail recursive
	def factorial(n: Int): Int = 
		if(n == 0) 1 else n* factorial(n-1)

//tail recursive
	def factorialTail(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if (n == 0) acc
			else loop(acc* n, n-1)
		loop(1,n)
	}
}
