object Variable {
    def main(args: Array[String]): Unit = {

        val x: Int = 10 // 불변 변수 (변경 불가)
        var y: Int = 20 // 가변 변수 (변경 가능)
       
       y = 30 // O 
    //    x = 40 // X (컴파일 오류)

       println(s"x: $x, y: $y");

       var name = "Alice"; // 가변 변수 
       var age = 25; // 가변 변수
    }
}