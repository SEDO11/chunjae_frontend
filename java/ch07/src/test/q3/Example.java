package test.q3;

public class Example {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.bcd();
    }

}
