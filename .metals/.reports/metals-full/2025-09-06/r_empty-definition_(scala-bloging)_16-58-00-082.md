error id: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/7.asy-concurrency/feture.scala:scala/concurrent/Future.
file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/7.asy-concurrency/feture.scala
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol scala/concurrent/Future.
empty definition using fallback
non-local guesses:

offset: 30
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-end/scala/scala-bloging/scala-bloging/src/main/scala/7.asy-concurrency/feture.scala
text:
```scala
import scala.concurrent.Future@@
import scala.util.{Success, Failure}
import scala.concurrent.ExecutionContext.Implicits.global

object FutureExample extends App {
    val f: Future[Int] = Future {
    // 시간이 걸리는 작업 (ex. 네트워크 요청)
    Thread.sleep(1000)
    42 
    }

    // 결과 처리
    f.onComplete {
        case Success(value) => println(s"Result: $value")
        case Failure(e) => println(s"Error: ${e.getMessage}")
    }


    Thread.sleep(2000)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 