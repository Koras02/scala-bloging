error id: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/5.Error-Handling/try-success-failure.scala:
file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/5.Error-Handling/try-success-failure.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -outputPath.
	 -outputPath#
	 -outputPath().
	 -scala/Predef.outputPath.
	 -scala/Predef.outputPath#
	 -scala/Predef.outputPath().
offset: 537
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/5.Error-Handling/try-success-failure.scala
text:
```scala

import scala.util.{Try, Success, Failure}
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}


object TrySuccessFailureExample {
    def main(args: Array[String]): Unit = {
      val result = Try("123a".toInt) // 실패할 수 있는 코드
      val sb = new StringBuilder()
      result match {
        case Success(value) =>
            println(s"성공: $value")
        case Failure(exception) => 
            println(s"실패: ${exception.getMessage}")
      }


     // UTF-8 파일 작성
    Files.write(outputPath@@, sb.toString.getBytes(StandardCharsets.UTF_8));
         sb.append("출력완료!: output.txt에 저장되었습니다.");
    
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 