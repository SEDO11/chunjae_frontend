package test;

public class MyGeneric<T> {
    T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}

class A {
    public String toString() {
        return "클래스 A 객체";
    }
}

class B {
    public String toString() {
        return "클래스 B 객체";
    }
}
