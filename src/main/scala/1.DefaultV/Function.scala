object Function {
    def main(args: Array[String]): Unit = {
        def add (x: Int , y: Int): Int = {
            return x + y
        }

        // return skip 
        def sub(a: Int, b: Int): Int = a - b

        println(add(3,5)) // 8
        println(sub(20, 10)) // 10
        def greet(name: String) = s"Hello, $name!"
        println(greet("Scala")) // Hello, Scala!
    }

}