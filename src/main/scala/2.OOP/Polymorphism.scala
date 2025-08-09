class Hitting {
    def hit(): Unit = println("...")
}

class Baseball extends Hitting {
    override def hit(): Unit = println("Hitting!")
}

object Polymorphism extends App {
    
    val a: Hitting = new Baseball 
    a.hit() // Output: Hitting!
    
}