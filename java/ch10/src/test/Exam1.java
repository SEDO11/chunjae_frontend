package test;

import com.sun.jdi.Value;

public class Exam1 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        MyGeneric mg1 = new MyGeneric<Object>();
        mg1.set(a1);
        A aout = mg1.get();
    }
}
