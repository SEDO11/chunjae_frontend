package sec3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
파일을 읽어오는 방법
FileReader, BufferedReader, Scanner, Files

FileReader는 Byte 단위로 데이터를 읽어온다.
 */
public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        fr = new FileReader("out3.txt");
        int rd;
        while((rd = fr.read()) != -1) {
            System.out.print((char) rd);
        }

    }
}
