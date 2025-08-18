error id: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/5.Error-Handling/try-catch-finally.scala:java/nio/charset/
file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/5.Error-Handling/try-catch-finally.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 60
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/5.Error-Handling/try-catch-finally.scala
text:
```scala
import java.nio.file.{Files, Paths}
import java.nio.charset@@.StandardCharsets

object TryCatchFinallyExample {
    def main(args: Array[String]): Unit = {
      val outputPath = Paths.get("output.txt"); // 한글 출력 파일
      val sb = new StringBuilder()

        try {
            val num = "123a".toInt // NumberFormatException 에러 발생
            sb.append(s"변환된 숫자: $num\n")
        } catch {
           case e: NumberFormatException => 
             sb.append("숫자로 변환할 수 없습니다!");
           case e: Exception => 
              sb.append("기타 예외 발생: " + e.getMessage)
        } finally {
          sb.append("무조건 실행되는 finally");
        }

        // UTF-8 파일 작성
        Files.write(outputPath, sb.toString.getBytes(StandardCharsets.UTF_8));
         sb.append("출력완료!: output.txt에 저장되었습니다.");
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 