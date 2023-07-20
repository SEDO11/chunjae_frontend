package sec1;

public class GenEx2 {
    public static void main(String[] args) {
        // 제네릭
        // 타입에 상관없이 사용 가능 한 것
        Gen2 g2 = new Gen2();
        g2.setT("안녕");
        System.out.println(g2.getT());
        g2.setT(12345);
        System.out.println(g2.getT());
        g2.setT(4512.48421);
        System.out.println(g2.getT());
    }
}
