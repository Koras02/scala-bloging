object Conditionals {
  def main(args: Array[String]): Unit = {
    val num = 10 

    if (num > 0) {
        println("Positive number")
    } else if (num < 0) {
        println("Negative number")
    } else {
        println("Zero")
    }
    //   조건문이 값으로 사용될 수 있음 
    val result = if (num > 0) "Positive" else "non-positive"
    println(result) // positive
  }

}