package sec2;

public class Example6 {
    public static void main(String[] args) {
        int a = 100;    // 10진수
        int b = 0b100;  // 2진수 | 컴퓨터 연산, 논리 연산등을 수행
        int c = 0100;   // 8진수 | 권한 부여 및 수행, 회수
        int d = 0x100;  // 16진수 | 실제 주소, 58-86-94-F8 이런 물리적주소(MAC) 또는 메모리주소
        System.out.printf("%d %d %d %d", a, b, c, d);
    }
}
