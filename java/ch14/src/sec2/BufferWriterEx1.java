package sec2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 출력방식 : BufferedWriter, PrintWrite, FileOutput, Files, DataOutputStream
public class BufferWriterEx1 {
    public static void main(String[] args) {
//        String path = "d:\\oh\\out3.txt";
//        File file = new File(path);

        File file = new File("out3.txt"); // File 객체는 자동으로 close를 한다.
        if(!file.exists()) { // 파일이 존재하지 않으면
            try {
                file.createNewFile(); // 파일을 새로 만들어라
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileWriter fw = new FileWriter("out3.txt"); // 연필
            BufferedWriter writer = new BufferedWriter(fw);     // 연필 사용자
            writer.write("점심시간 10분 전"); // Stream과 달리 문자열로 입력 가능
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
