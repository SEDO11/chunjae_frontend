package sec01;

public class Example2 {
    public static void main(String[] args) {
        // 대입연산 : =, +=, -=, *=, /=, %=
        int su = 0;
        float num = 0;

        su += 10;
        System.out.println(su);

        su-=5;
        System.out.println(su);

        su*=10;
        System.out.println(su);

        num = su / 4.0f;
        su/=4;
        System.out.println(su);
        System.out.println(num);

        // 증감연산 : ++, -- 전위 후위
        int a = 10, b = 10;
        System.out.println(a++ + " " + ++b);
        System.out.println(a+" "+b);
        System.out.println(--a + " " + b--);
        System.out.println(a+" "+b);
    }
}
