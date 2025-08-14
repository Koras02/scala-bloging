package patterncase

case class Person(name: String, age: Int)
case class Book(title: String, author: String)

object CasePatternExample {
    def describe(x: Any): String = x match {
        case Person(name, age) if age < 18 =>
            s"$name is minor"
        case Person(name, age) => 
            s"name is an adult"
        case Book(title, author) =>
            s"Book titled: $title $author"
        case _: Any => 
           "Not Found Loading Book List!" 
    }


    def main(args: Array[String]): Unit = {
        println(describe(Person("Scala Tutorial", 15))) // Scala is a minor 
        println(describe(Person("Jimmy", 25))) // Jimmy is a adult
        println(describe(Book("Scala Guide", "John")))
    }
}