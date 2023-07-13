package sec2;

import java.util.Date;

public class Example3 {
    public static void main(String[] args) {
        Date today = new Date();

        String data1 = "2023-07-13";
        String data2 = new String(today.toString());
        System.out.println(data2);

        String info = "";
        String name = "김기태";
        int age = 26;
        float ht = 173.8f;
        
        // 문자 + 숫자 = 문자
        info = name + age;

    }
}
