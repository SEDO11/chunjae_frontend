package sec2;

import sec1.Member; // ch05
import sec1.Example3; // ch04

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        Member m1 = new Member();
        System.out.println(m1.getName());

        Example3 e3 = new Example3();
        String[] s1 = new String[4];
        String[] s2 = e3.add(s1, "하이");
        System.out.println(Arrays.toString(s2));

    }
}
