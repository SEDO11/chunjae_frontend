package sec3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader 는 String 타입으로 데이터를 읽어온다.
 */
public class BufferedReaderEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(
                new FileReader("out4.txt")
        );

        String data;
        while((data = rd.readLine()) != null) {
            System.out.println(data);
        }
    }
}
