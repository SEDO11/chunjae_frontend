package test.q3;

public class A {
    void print() {
        System.out.println("클래스 A 메서드");
    }
    class B {
        void print() {
            System.out.println("클래스 B 메서드");
        }
        void bcd() {
            A.this.print();
        }
    }
}
