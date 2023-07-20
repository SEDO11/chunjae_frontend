package test;

class A5 {

}
class B5 extends A5 {

}

class C5 extends B5 {

}

class My10<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class MyClass10 {
    void method1(My10<B5> a) {} // B5 클래스만 가능
    void method2(My10<?> a) {} // 모든 클래스 가능
    void method3(My10<? extends B5>  a) {} // B5 이하(자식)의 클래스만 가능
    void method4(My10<? super B5> a) {} // B5 이상(부모)의 클래스만 가능
}

public class Test5 {
    public static void main(String[] args) {
        MyClass10 mc = new MyClass10();
        
//        mc.method1(new My10<A5>());
        mc.method1(new My10<B5>());
//        mc.method1(new My10<C5>());

        mc.method2(new My10<A5>());
        mc.method2(new My10<B5>());
        mc.method2(new My10<C5>());

//        mc.method3(new My10<A5>());
        mc.method3(new My10<B5>());
        mc.method3(new My10<C5>());

        mc.method4(new My10<A5>());
        mc.method4(new My10<B5>());
//        mc.method4(new My10<C5>());
    }
}
