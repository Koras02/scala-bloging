object ImutabilityExample {
    def main(args: Array[String]): Unit = {
        val nums = List(1, 2, 3)
        // nums(0) = 10 // 🚫 불변 컬렉션 수정 불가

        val newNums = nums :+ 4 // 새로운 리스트 생성
        println(s"원본: $nums") // 원본: List(1, 2, 3)
        println(s"수정본: $newNums") // 수정본: List(1, 2, 3, 4)
    }
}