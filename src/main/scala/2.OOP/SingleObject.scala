object Logger {
    def log(msg: String): Unit = {
        println(s"Log: $msg")
    }
}

object SingleObject extends App {
    Logger.log("This is a log message")
}