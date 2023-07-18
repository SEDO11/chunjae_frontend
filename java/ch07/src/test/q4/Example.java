package test.q4;

class A {
    static class B {
        void bcd() {
            System.out.println("정적 이너 클래스");
        }
    }
}

public class Example {
    public static void main(String[] args) {
        A.B ab = new A.B();
        ab.bcd();
    }
}
