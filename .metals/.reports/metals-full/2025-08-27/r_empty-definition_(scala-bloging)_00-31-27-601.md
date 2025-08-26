error id: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/mapFilter.scala:_empty_/Filter.main().
file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/mapFilter.scala
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol _empty_/Filter.main().
empty definition using fallback
non-local guesses:

offset: 211
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

object Filter {
    def main@@(args: Array[String]) : Unit = {
        val nums = List(1,2,3,4)
        val evens = nums.filter(_ % 2 == 0)
        println(evens); // List(2,4)
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 