package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

// Stream(스트림)
/*
바이트배열(문자열) 단위로 입력하거나 출력하는 클래스
* */
public class StreamEx1 {
    public static void main(String[] args) {
        /*
        Input -> 파일에 있는 자료를 가져오기 - InputStream
            FileInputStream, ByteArrayInputStream, FilterInputStream

        Output -> 파일에 자료를 저장하기 - OutputStream
            FileOutputStream, ByteArrayOutputStream, FilterOutputStream
        */
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("out1.txt");
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("출력 파일이 존재하지 않거나 경로가 틀림");
            throw new RuntimeException(e);
        } finally {
        }

        try{
            FileInputStream fis = new FileInputStream("out1.txt");
            byte b;
            while((b = (byte) fis.read()) != -1) {
                System.out.println((char)b);
            }

            // while 문 쓰지 않고 한 번에 받기
//            byte[] b2 = fis.readAllBytes();
//            System.out.println(new String(b2));

            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("입력 파일이 존재하지 않거나 경로가 틀림");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
