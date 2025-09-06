import scala.concurrent.{Future, ExecutionContext}
import java.util.concurrent.Executors
import scala.util.{Success,Failure}

object CustomECExample extends App {
    // 글로벌 ExecutionContext를 implicit로 지정
    implicit val ec = ExecutionContext.fromExecutorService(Executors.newFixedThreadPool(4))

    val f = Future {
        println(s"Thread: ${Thread.currentThread().getName}")
        42
    }(ec) // Future 실행 시 명시적으로 ec 전달

    f.onComplete {
        case Success(value) => println(s"result: $value")
        case Failure(e) => println(s"Fail: ${e.getMessage}")
    }

    Thread.sleep(1000)
    ec.shutdown()
}