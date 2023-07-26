package sec2;

// nio는 네트워크 io
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Files를 이용한 파일 입출력
public class FilesEx1 {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\chunjae_frontend\\java\\ch14\\out6.txt");
        try {
            Files.write(path, "안\"녕하세요".getBytes());
            System.out.println(new String(Files.readAllBytes(path)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
