package sec4;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringEx2 {
    public static void main(String[] args) {
        String mem1 = "이슬비/박나연/최상민/황교진/김이호";
        String[] m1 = mem1.split("/");
        System.out.println(Arrays.toString(m1));
        for(String s:m1) {
            System.out.println(s);
        }
        System.out.println();

        // 여러 구분자를 이용해 나눌경우
        String mem2 = "신승원&오세훈,백준철,구예진-김기태";
        String[] m2 = mem2.split("&|,|-");
        System.out.println(Arrays.toString(m2));
        System.out.println();
        
        // StringTokenizer 를 이용한 방법
        String mem3 = "오태훈/신예은/박진관/김현경/김보경";
        StringTokenizer m3 = new StringTokenizer(mem3, "/");
        int cnt = m3.countTokens(); // 토큰에 의해 분리된 요소수
        for (int i=0; i<cnt; i++) {
            String token = m3.nextToken();
            System.out.println(token);
        }
        
    }
}
