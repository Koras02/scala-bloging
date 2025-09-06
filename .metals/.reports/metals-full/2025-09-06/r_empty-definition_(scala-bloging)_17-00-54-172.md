error id: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/7.asy-concurrency/for-comprehension.scala:
file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/7.asy-concurrency/for-comprehension.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -result/onComplete.
	 -result/onComplete#
	 -result/onComplete().
	 -scala/Predef.result.onComplete.
	 -scala/Predef.result.onComplete#
	 -scala/Predef.result.onComplete().
offset: 288
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/7.asy-concurrency/for-comprehension.scala
text:
```scala
import scala.concurrent.Future
import scala.util.Failure
import scala.util.Success



object FutureForExample extends App {
    val f1 = Future { 10 }
    val f2 = Future { 20 }

    val result: Future[Int] = for {
        a <- f1
        b <- f2 
    } yield a + b

    result.onComplete@@ {
        case Success(sum) => println(s"result: $sum");
        case Failure(e) => println(s"Fail: ${e.getMessage}")
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 