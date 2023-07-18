package test;

public class Example5 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        A1 a2 = new A1();

        a1.a = 30;
        a1.b = 40;

        a2.a = 50;
        a2.b = 60;

        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a2.a);
        System.out.println(a2.b);

    }
}
