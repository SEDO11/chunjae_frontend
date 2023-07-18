package test.q12_8;

public class B implements A{
    @Override
    public void abc() {
        A.super.abc();
        System.out.println("B 클래스");
    }
}
