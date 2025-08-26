
// Immutable
object Immutable{
    def main(args: Array[String]): Unit = {
        // Immutable 
        val list = List(1,2,3);
        // list = list :+4 // 오류 , val 은 재할당 X
        val newList = list :+4; // 새로운 리스트 생성
        println(newList);
    }
}




// Mutable
import scala.collection.mutable.ListBuffer

object Mutable {
    def main(args: Array[String]) : Unit = {
        val mlist = ListBuffer(1,2,3);
        mlist += 4 // 직접 변경 가능
        println(mlist); // ListBuffer(1,2,3,4,5)
    }
}