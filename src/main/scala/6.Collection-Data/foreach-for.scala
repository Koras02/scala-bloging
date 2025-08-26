// for
object For {
     def main(args: Array[String]) : Unit = {
        for (n <- 1 to 5 if n % 2 == 0) {
            println(n) // 2, 4
        }
     }
}

// forEach
object ForEach {
    def main(args: Array[String]) : Unit = {
         val nums = List(1,2,3)
         nums.foreach(n => println(n * 2))  // result: 2, 4, 6  
    }
}

object ForEachArray {
    def main(args: Array[String]) : Unit = {
        val numbers = "name"
        println(StringContext("Hello " , "" ).s(numbers))
    }
}


// collection (컬렉션 기반)
object Collection {
  def main(args: Array[String]) : Unit = {
    val nums = List(1,2,3,4)
    for(n <- nums) println(n) 
  }
}

// for-yield (컬렉션 변환)
object Yield {
    def main(args: Array[String]): Unit = {
        val nums = List(1,2,3,4)
        val doubled = for(n <- nums) yield n * 2
        println(doubled) // List(2,4,6,8)
        val triple = for(n <- nums) yield n * 3
        println(triple) // List(3,6,9,12)
    }
}