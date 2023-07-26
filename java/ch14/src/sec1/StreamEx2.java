package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// 키보드로 문자를 입력받아 out2.txt로 저장
// 그 내용을 불러와 콘솔창에 다시 출력
public class StreamEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 파일에 값을 저장
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("out2.txt");
            String s = sc.nextLine(); // String 형태로 입력
            byte[] b = s.getBytes(); // byte 배열로 변환
            fos.write(b); // 바이트로 파일에 데이터 입력
            fos.close(); // 입력 종료
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        // 파일을 불러와서 값을 가져옴
        FileInputStream fis;
        try {
            fis = new FileInputStream("out2.txt");

            // 1. 한 글자씩 불러와서 읽어 처리하는 방식
            byte b;
            while((b = (byte) fis.read()) != -1) { 
                System.out.print((char) b);
            }

            // 2. 한번에 모든 글자를 불러와서 처리하는 방식
//            byte[] b = fis.readAllBytes();
//            System.out.println(new String(b));

            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
