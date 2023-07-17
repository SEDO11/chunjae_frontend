package sec1;

public class Disendant extends Man{
    @Override
    public void method1() {
        System.out.println("후손 메소드1");
    }

    @Override
    public int method2() {
        return 2;
    }

    @Override
    public void method3(int no) {
        System.out.println("후손 메소드3 : " + no+2);
    }

    @Override
    public int method4(int no) {
        return no+2;
    }
}
