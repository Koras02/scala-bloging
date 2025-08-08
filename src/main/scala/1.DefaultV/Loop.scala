object Loop {
    def main(args: Array[String]): Unit = {
        // 1. for loop
        for (i <- 1 until 5) {
            println(i); // 1, 2, 3, 4
        }

        // 2. while loop
        var j = 0
        while (j < 5) {
            println(j); // 0, 1, 2, 3, 4
            j += 1
        }
    }
}
