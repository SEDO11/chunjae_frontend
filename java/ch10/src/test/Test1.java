package test;

class My1<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class A {
    @Override
    public String toString() {
        return "클래스 A 객체";
    }
}

class B {
    @Override
    public String toString() {
        return "클래스 B 객체";
    }
}

public class Test1 {
    public static void main(String[] args) {
        A a_in = new A();
        B b_in = new B();

        My1<A> mg1 = new My1<A>();
        mg1.setT(a_in);
        A a_out = mg1.getT();
        System.out.println(a_out);

        My1<B> mg2 = new My1<>();
        mg2.setT(b_in);
        B b_out = mg2.getT();
        System.out.println(b_out);
    }
}
