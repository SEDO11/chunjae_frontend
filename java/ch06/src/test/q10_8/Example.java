package test.q10_8;

public class Example {
    public static void main(String[] args) {
        A ab = new B();
        B bb = new B();
        System.out.println(ab.m); // 여기는 자식이 아닌 부모 필드가 호출
        System.out.println(ab.n);
        ab.method1();
        ab.method2();

        System.out.println(bb.m);
        System.out.println(bb.n);
        bb.method1();
        bb.method2();
    }
}
