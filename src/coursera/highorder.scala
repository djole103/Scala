//this is doing a sigma summation where you pass the function being summed

def sum(f: Int => Int)(a: Int, b: Int): Int = {
	def loop(a: Int, acc: Int): Int = {
		if(a>b) acc
		else loop(a+1,f(a) + acc)
	loop(a,0) 
	}
}

//currying, we want to simplify further get rid of parameters

def sum(f: Int => Int): (Int, Int) => Int = {
	def sumF(a: Int, b: Int): Int =
		if (a > b) 0
		else f(a) + sumF(a + 1, b)
	sumF
}

object product {
	def product(f: Int => Int)(a: Int, b: Int): Int = 
		if (a >b) 1
		else f(a) * product(f)(a+1,b)
	product(x => x * x)(3,4)

	def fact(n :Int) = product(x=> x)(1,n)
	fact(5)

	def mapReduce(f: Int => Int, combine : (Int,Int) => Int, zero: Int)(a: Int,b: Int): Int=
		if (a>b) zero
		else combine(f(a), mapReduce(f, combine, zero)(a+1,b))
}
