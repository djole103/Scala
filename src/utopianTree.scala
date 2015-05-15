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
