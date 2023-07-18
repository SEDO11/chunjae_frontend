package test;

class A {
    int a = 3;
    static int b = 4;
    void method1() {

    }
    static void method2() {

    }
    static class B {
        void bcd() {
//            System.out.println(a);
            System.out.println(b);
//            method1();
            method2();
        }
    }
}

public class Example5 {
}
