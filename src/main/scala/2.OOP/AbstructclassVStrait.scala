abstract class Animal {
    def sound(): Unit
}
trait FourLegged {
    def walk(): Unit = {
        println("Walking on four legs") 
    }
}

class Dog extends Animal with FourLegged {
    def sound(): Unit = {
        println("Woof!")
    }
}

object ABObject extends App {
   val dog = new Dog()
   dog.sound() // Outputs: Woof!
   dog.walk() // Outputs: Walking on four legs
}