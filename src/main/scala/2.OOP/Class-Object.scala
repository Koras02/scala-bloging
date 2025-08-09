class Person(val name: String, val age: Int) {
    def greet(): Unit = {
        println(s"Hello, my name is $name and I am $age years old.")
    }
}

object ClassObject extends App {
    val p = new Person("Charlie", 30)
    p.greet()
}