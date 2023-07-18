package test.q10_10;

public class B extends A{
    public B() {
        System.out.println("B 생성자1");
    }

    public B(int a) {
        super(a);
        System.out.println("B 생성자2");
    }
}
