error id: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/mapFilter.scala:
file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/mapFilter.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -lettrs.
	 -lettrs#
	 -lettrs().
	 -scala/Predef.lettrs.
	 -scala/Predef.lettrs#
	 -scala/Predef.lettrs().
offset: 570
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/mapFilter.scala
text:
```scala
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
        println(l@@ettrs)
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 