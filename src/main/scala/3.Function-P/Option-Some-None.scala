object OSNExample {
    def findName(id: Int): Option[String] = {
        val names = Map(1 -> "Alice", 2 -> "Bob")
        names.get(id)  // 값이 없으면 None
    }

    def main(args: Array[String]): Unit = {
        val name1 = findName(1)
        val name2 = findName(3) 

        println(s"name1 = $name1") // name1 = Some(Alice)
        println(s"name2 = $name2") // name2 = None

        // 안전한 처리
        println(name1.getOrElse("Unknown")) // Alice 
        println(name2.getOrElse("Unknown")) // Unknown
    }
}