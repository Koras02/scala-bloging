object PureFunctionExample {
    // 순수 함수 
    def add(a: Int, b: Int): Int = a + b;

    // 비순수 (부수효과 포함) 예시 - 테스트/재사용성 떨어지는 코드
//    def addAndPrint(a: Int, b: Int): Int = {
//      val r = a + b
//     //  println(s"result = $r") // 부수 효과
//    }

   def main(args: Array[String]): Unit = {
    var result1 = add(3,5)
    var result2 = add(3,5)

    println(s"result1 = $result1") // result1 = 8
   }
}