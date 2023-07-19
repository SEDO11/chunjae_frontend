package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example7 {
    // 파일 처리 작업은 반드시 try~catch 예외가 필수이다.
    public static void main(String[] args) {
        FileInputStream fis = null; // 파일에 내용을 저장하는 클래스
        FileOutputStream ois = null; // 파일의 내용을 불러오는 클래스
        
        // 다중 예외 처리
        try{
            fis = new FileInputStream("./src/sec1/infile2.txt");
            System.out.println("fis 연결");

            try {
                ois = new FileOutputStream("./src/sec1/outfile.txt"); // 없으면 파일 생성
                System.out.println("ois 연결");

                try {
                    Class clazz = Class.forName("maria");
                } catch (Exception e) {
                    System.out.println("clazz 해당 파일 존재하지 않음 | "+e.getMessage());
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                System.out.println("ois 해당 파일 없음 | "+e.getMessage());
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 존재하지 않음");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("연결 종료");
        }
    }
}
