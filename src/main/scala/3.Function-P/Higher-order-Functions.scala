object HigerOrderExample {
    // 함수를 인자로 받음
    def applyTwice(f: Int => Int, x: Int): Int = f(f(x))

    def main(args: Array[String]): Unit = {
        val double = (n: Int) => n * 2
        val result = applyTwice(double, 5)
        println(s"applyTwice(double, 5) = $result") // applyTwice(double, 5) = 20
    }
}