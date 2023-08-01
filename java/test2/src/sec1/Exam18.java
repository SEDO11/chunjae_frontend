package sec1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exam18 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<5; i++) {
            map.put("아이디"+i, i);
        }
        System.out.println(map.toString());
    }
}
