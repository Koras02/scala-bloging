import scala.concurrent.Future
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