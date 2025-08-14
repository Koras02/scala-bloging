package patterncase


object SequencePatternExample {
    def main(args: Array[String]): Unit = {
        val nums = List(1,2,3);

        nums match {
            case Nil => println("Empty List");
            case head :: tail => println(s"Head: $head, Tail: $tail") // Head: 1, Tail: List(2, 3)
        }
    }
}
