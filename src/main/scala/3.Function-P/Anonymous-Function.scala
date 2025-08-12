object AnonymousFunctionExample {
   def main(args: Array[String]): Unit = {
     val nums = List(1, 2, 3, 4); 
     val doubled = nums.map(n => n * 2)
     println(s"doubled = $doubled") // doubled = List(2, 4, 6, 8) 


     // 더 축약된 문법
     val tripled = nums.map(_ * 3)
     println(s"tripled = $tripled") // tripled = List(3, 6, 9, 12)
   }
}