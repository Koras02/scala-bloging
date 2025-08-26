// map
object Map {
  def main(args: Array[String]) : Unit = {
    val nums = List(1,2,3)
    val squares = nums.map(n => n * n)
    println(squares); // List(1,4,9)
  }
}

// filter 
object Filter {
    def main(args: Array[String]) : Unit = {
        val nums = List(1,2,3,4)
        val evens = nums.filter(_ % 2 == 0)
        println(evens); // List(2,4)
    }
}

// flatMap
object FlatMap {
    def main(args: Array[String]) : Unit = {
        val words = List("Hello", "World")
        val letters = words.flatMap(_.toList)
        println(letters) // List(H, e, l, l, o, W, o, r, l, d)
    }
}

// reduce / fold
object ReduceFold {
    def main(args: Array[String]) : Unit = {
        val nums = List(1,2,3,4) // 1 + 2 + 3 + 4
        val sum = nums.reduce(_ + _)
        println(sum) // 10

        val product = nums.fold(1)(_ * _) // 1 * 2 * 3 * 4
        println(product) // 24
    }
}

// zip
object Zip {
    def main(args: Array[String]): Unit = {
        val a = List(1,2,3)
        val b = List("a", "b", "c")
        val zipped = a.zip(b)
        println(zipped) // List((1,a), (2,b), (3,c))
    }
}