package patterncase

// 같은 파일 내에서만 상곡 가능함
sealed trait Shape {
    def description: String 
}

// 다양한 서브 클래스들
case class Circle(radius: Double) extends Shape {
    def description: String = s"Circle with radius $radius"
}

case class Rectangle(width: Double, height: Double) extends Shape {
   def description: String = s"Rectangle with width $width and height $height"
}

case class Triangle(a: Double, b:Double, c:Double) extends Shape {
    def description: String = s"Triangle with sides $a, $b, $c"
}

case object UnknownShape extends Shape {
    def description: String = "Unknown shape"
}

object SealedClassExample {
    def area(shape: Shape): Double = shape match {
        case Circle(r) => Math.PI * r * r
        case Rectangle(w, h) => w * h
        case Triangle(a, b, c) =>
         // 해론의 공식(Heron's formula)
         val s = (a + b + c) / 2
         Math.sqrt(s * (s - a) * (s - b) * (s - c))
        case UnknownShape => 0.0
    }

    def shapeInfo(shape: Shape): String = shape match {
        case c @ Circle(_) => s"${c.description}, area = ${area(c)}"
        case r @ Rectangle(_, _) => s"${r.description}, area = ${area(r)}"
        case t @ Triangle(_, _, _) => s"${t.description} area = ${area(t)}"
        case UnknownShape => s"${UnknownShape.description}, area = 0.0" 
    }

    def main(args: Array[String]): Unit = {
        val shapes: List[Shape] = List(
            Circle(5),
            Rectangle(4, 6),
            Triangle(3, 4, 5),
            UnknownShape
        )

        shapes.foreach(s => println(shapeInfo(s)))
    }
}

