package sec01;

public class Example1 {
    public static void main(String[] args) {
        // 연산 : OPcode, Opereand -> 명령코드, 데이터 메모리 주소
        // 연산 종류 : 산술연산, 논리연산, 관계연산, 대입연산, 증감연산, 비트연산, 기타연산
        // %%를 해야 print에서 %를 출력

        // 산술연산 : +, -, *, /, %
        int a = 20;
        int b = 30;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = b/a;
        int g = b%a;
        System.out.printf("%d \t%d \t%d \t%d \t%d \t%d \t%d\n", a, b, c, d, e, f, g);

        int k = 20;
        System.out.println(Integer.toBinaryString(k)+ " " + k);
        k <<= 4;
        System.out.println(Integer.toBinaryString(k)+ " " + k);
        k >>= 2;
        System.out.println(Integer.toBinaryString(k)+ " " + k);
    }
}
