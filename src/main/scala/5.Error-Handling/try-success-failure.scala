
import scala.util.{Try, Success, Failure}
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}


object TrySuccessFailureExample {
    def main(args: Array[String]): Unit = {
      
      val outputPath = Paths.get("output.txt"); // 한글 출력 파일
      val result = Try("123a".toInt) // 실패할 수 있는 코드
      val sb = new StringBuilder()

      result match {
        case Success(value) =>
            sb.append(s"성공: $value")
        case Failure(exception) => 
            sb.append(s"실패: ${exception.getMessage}")
      }


     // UTF-8 파일 작성
    Files.write(outputPath, sb.toString.getBytes(StandardCharsets.UTF_8));
         sb.append("출력완료!: output.txt에 저장되었습니다.");
    
    }
}