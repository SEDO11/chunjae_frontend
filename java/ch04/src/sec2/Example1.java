package sec2;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] i = {50, 60, 70};
        double[] d = {453.4854, 4878.77548, 999.9999};
        boolean[] b = {false, true, true};
        String[] s = {"가", "나", "다"};

        System.out.println(i); // [I@ -> cpu, 숫자 -> 메모리 주소
        
        //Arrays, for(순회)문을 사용하지 않고 배열 형태의 자료형을 바로 출력하도록 만들어줌
        System.out.println("int[] i ="+Arrays.toString(i));
        System.out.println("double[] d ="+Arrays.toString(d));
        System.out.println("boolean[] b ="+Arrays.toString(b));
        System.out.println("String[] s ="+Arrays.toString(s));

    }
}
