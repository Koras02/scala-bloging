error id: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/foreach.scala:
file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/foreach.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -n.
	 -n#
	 -n().
	 -scala/Predef.n.
	 -scala/Predef.n#
	 -scala/Predef.n().
offset: 83
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/6.Collection-Data/foreach.scala
text:
```scala
// for
object For {
     def main(args: Array[String]) : Unit = {
        for (n@@ <- 1 to 5 if n % 2 == 0) {
            println(n) // 2, 4
        }
     }
}

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
```


#### Short summary: 

empty definition using pc, found symbol in pc: 