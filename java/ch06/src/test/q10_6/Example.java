package test.q10_6;

public class Example {
    public static void main(String[] args) {
        A aa = new A();
        aa.hello();

        B bb = new B();
        bb.hello();

        A ab = new B();
        ab.hello();
    }
}
