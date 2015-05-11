class Complex(real : Double, imaginary : Double){
	println("in class")
	def re = real
	def im = imaginary
}

object ComplexNums {
	println("in object")
	def main(args : Array[String]){
		println("in main")
		val c = new Complex(2,3)
		println("Real part: " + c.re)
	}
}



