object CollectionFunctionExample {
    def main(args: Array[String]): Unit = {
        val nums = List(1, 2, 3, 4, 5)

        val squared = nums.map(n => n * n)
        println(s"squared = $squared") // squared = List(1, 4, 9, 16, 25)

        val evens = nums.filter(_ % 2 == 0)
        println(s"evens = $evens") // evens = List(2, 4)

        val sum = nums.reduce(_ + _)
        println(s"sum = $sum") // sum = 15
    }
}
