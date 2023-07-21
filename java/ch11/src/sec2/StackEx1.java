package sec2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<String> st1 = new Stack<>();
        st1.push("A");
        st1.push("B");
        st1.push("C");
        st1.push("D");
        System.out.println(st1);
        
        // D 빼기
        st1.pop();
        System.out.println(st1);
        
        // C 빼기
        st1.pop();
        System.out.println(st1);
    }
}
