// Set 
object Set {
    def main(args: Array[String]) : Unit = {
        val nums = List(1,2,2,3)
        val unique = nums.toSet

        val str = List(
            "Mason", "Kelly", "Gold", "Pictures", 
            "Gold", "King", "Take", "Kelly"
        );
        val uniques = str.toSet
        println(uniques) // HashSet(Take, King, Pictures, Gold, Mason, Kelly)

        println(unique) // Set(1,2,3)
    }
}

import scala.collection.immutable.Map
import scala.io.StdIn 

// Map 
object Maps {
    def main(args: Array[String]) : Unit = {
        val map = Map("Dragon" -> 1, "Player" -> 2)

        // New
        val newMap = map + ("Hp Default" -> 100)
        println(newMap) // Map(Dragon -> 1, Player -> 2, Hp Default -> 100)

        val Menu = Map("Game Start" -> 1, "Options" -> 2, "Exit" -> 3)

    }
}