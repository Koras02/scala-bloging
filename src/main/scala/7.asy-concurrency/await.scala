import scala.concurrent.Await 
import scala.concurrent.duration._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global 

object AwaitExample extends App {
    val f = Future { 100 }
    
    val result = Await.result(f, 2.seconds)
    println(s"Await result: $result")
}