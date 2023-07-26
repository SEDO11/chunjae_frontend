package sec2;

/*
출력을 버퍼, 한 줄, 한 글자, 문자열 등의 모든 단위의 파일에 쓰기 작업이 가능
 */

import java.io.*;

public class PrintWriterEx1 {
    public static void main(String[] args) {
        try{
            File file = new File("out4.txt");
            if(file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter("out4.txt"); // 연필
            PrintWriter writer = new PrintWriter(fw);     // 연필을 정말 잘 쓰는 사용자
            writer.write("점심시간 10분 전"); // Stream과 달리 문자열로 입력 가능
            writer.println("\t배고파 죽겠어");
            writer.print(" 밥먹고싶다");
            writer.print("\n너무 배고프다");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
