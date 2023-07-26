package sec1;

import java.io.*;
import java.util.Arrays;

public class FileOutputEx1 {
    public static void main(String[] args) {
        File file = new File("out5.txt");
        if(file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream("out5.txt");
            fos.write("밥은 먹고 다니니".getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("out5.txt");
            System.out.println(new String(fis.readAllBytes()));
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
