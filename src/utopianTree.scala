object UtopianTree {

    def main(args: Array[String]) {
        //val tests = readLine.split(" ").map(_.toInt)
        val tests : Int = readInt()
        for(a <-1 to tests){
            var cycles : Int = readInt()
            println(cycleLoop(cycles))
        }
    }
    
    def cycleLoop(cycles : Int) : Int ={
        var cyc : Int = cycles
        var height : Int = 1
        while(cyc>0){
                height = height *2
                cyc = cyc -1
                if(cyc>0) height = height +1
                else return height
                cyc = cyc -1
        }
        return height
    }
}

object UtopianTree2 {

    def main(args: Array[String]) {
        val tests : Int = readInt()
        (1 to tests).foreach{
		_ =>
		 val cycles : Int = readInt()
		 val res = (1 to cycles).foldLeft(1) {
			case(acc, cycle) => if(cycle % 2 ==1) acc * 2 else acc+1
		}
		println(res)
        }
    }
}

