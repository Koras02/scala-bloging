error id: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/4.Pattern-Case/SealedClassExample.scala:local6
file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/4.Pattern-Case/SealedClassExample.scala
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol local6
empty definition using fallback
non-local guesses:

offset: 739
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/4.Pattern-Case/SealedClassExample.scala
text:
```scala
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
        case Circle(r) => Math.PI * r@@ * r
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
    }
}


```


#### Short summary: 

empty definition using pc, found symbol in pc: 