package sec2;

import java.io.*;

/*
한글과 같은 캐릭터 셋을 지정하여 출력할 수 있음
기본 셋 UTF8
처음에 NULDLE 가 생기는데 이것은 데이터의 시작을 의미한다. | 지우면 안 됨

지정 순서
File -> FileOutputStream -> BufferedOutputStream -> DataOutputStream
* */

public class DataOutputStreamEx1 {
    public static void main(String[] args) {
        File file = new File("out7.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos); // buffer를 이용해 접근해야 한다.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            dos.writeUTF("헬로우 브로"); // UTF8
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            dos.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//        dis.readUTF();
    }
}
