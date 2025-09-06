import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

object ForComprehensionExample extends App {
   val f1 = Future { 10 }
   val f2 = Future { 20 }

   val result: Future[Int] = for {
    a <- f1 
    b <- f2 
   } yield a + b 

   result.onComplete {
    case Success(sum) => println(s"total: $sum")
    case Failure(e) => println(s"fail: ${e.getMessage}")
   }

   Thread.sleep(1000) // App 종료 방지
}