package sec01;

public class Example4 {
    public static void main(String[] args) {
        // 비트연산
        int a = 20;
        int b = 14;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a); // 보수 | 0 -> -1, 1 -> -2, 2-> -3, 20->-21
        System.out.println(a^b);
        System.out.println(a>>2); //오른쪽 시프트는 2**n 나누기 이다. | 왼쪽 시프트는 2**n 곱하기 이다.
        System.out.println(a>>>2); // 임베디드 쪽에서는 다르지만 웹 쪽에서는 같다.
        System.out.println(a<<2);
//        System.out.println(a<<<2); // 얘는 없다.
    }
}
