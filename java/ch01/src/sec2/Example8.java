package sec2;

// 참조 타입 변수

public class Example8 {
    public static void main(String[] args) {
        String name = "오세훈";
        int age = 26;
        double wt = 74;
        System.out.println("출력문 예시1");
        System.out.printf("이름: \"%s\"\t나이: \"%d\"\t체중: \"%3.2f\"", name, age, wt);
        System.out.println("\n\n출력문 예시2");
        System.out.println("이름: \""+name+"\"\t나이: \"" + age + "\"\t체중: \"" + wt+ "\"");

        int num1 = 127;
        // 자바의 진법 변환
        String bin = Integer.toBinaryString(num1);
        String oct = Integer.toOctalString(num1);
        String hex = Integer.toHexString(num1);
        System.out.printf("2진수: %s \n8진수: %s \n16진수: %s\n10진수: %d\n", bin, oct, hex, num1);

        int num2 = Integer.parseInt(oct) + Integer.parseInt(bin);

        System.out.printf("%d\n", num2);

        int b1 = 0b101111;
        int o1 = 0746;
        int x1 = 0x4fc;
        System.out.printf("%d %d %d\n", b1, o1, x1);

        int j = b1 + o1 + x1;
        System.out.println(j);
    }
}
