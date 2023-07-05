package sec1;
// 자료형
public class Example2 {
    public static void main(String[] args) {
        // 기본타입변수는 표현 범위가 있으며 벗어나면 오류가 뜨고 반드시 초기화 진행
        boolean a = true; // 논리형 | 0, 1 | 1bit
        byte b = 127; // 문자 숫자 다 가능, 1byte, -128 ~ 127
        char c = 'A'; // 단일 문자, 2byte
        short d = 32767; // 반정도 정수, 2byte -2^15 ~ 2^15-1
        int e = 2100000000; // 단정도 정수, 4byte
        Long f = 8999999999997878787L; // 배정도 정수, 4byte -> 8byte (L 을 붙혀서 확장)
        float g = 1234256.845254f; // 단정도 실수, 4byte
        double h = 3.154252845845235512d; // 배정도 실수, 8byte

        String s = "Hello"; // 문자열, 참조 타입

//        System.out.printf("%f\n%f\n",g, h);
        System.out.printf("a=%b\nc=%c\ns=%s\nb=%d\ne=%d\nf=%d\ng=%f\nh=%f\n", a, c, s, b, e, f, g, h);
//        System.out.println(Math.abs(d));
//        System.out.println((int) Math.pow(2, 15));
    }
}
