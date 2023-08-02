package sec2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exam18 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<5; i++) {
            map.put("아이디"+i, i*10);
        }
        System.out.println(map.toString());
    }
}
