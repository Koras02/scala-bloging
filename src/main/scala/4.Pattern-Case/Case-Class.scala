package patterncase

case class Tabacco(name: String, nicotine: Double, tar: Double)


object CaseClassExample {
    def main(args: Array[String]): Unit = {
        var t1 = Tabacco("Malboro Red", 8.0 , 0.9);
        var t2 = t1.copy(name = "Malboro Gold", 6.0, 0.50);

        println(t1); 
        println(t2);
    }
}

