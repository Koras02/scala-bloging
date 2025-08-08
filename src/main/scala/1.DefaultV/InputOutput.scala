object InputOutput {
    def main(args: Array[String]): Unit = {
        // 1. Output 
        println("Hello, Scala!") // prints to console
        print("Hello ") // prints without newline
        printf("Age: %d\n", 25) // formatted output

        // 2. Input 
        import scala.io.StdIn._

        print("Enter your name: ")
        val name = readLine() // reads a line from console 

        print("Enter your age: ")
        val age = readInt() // reads an integer from console

        println(s"name: $name, age: $age") // prints the input values
    }
}