package  patterncase

object PatternMAtchingExample {
 def main(args: Array[String]): Unit = {
    val x: Any = 42

    x match {
    case 0 => println("Zero")
    case i:Int if i > 0 => println(s"Positive Int: $i") // 타입 + 조건 
    case s:String => println(s"String: $s") // 타입 매칭
    case _ => println("Something else") // 디폴트
  }
 }
}