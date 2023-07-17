package test2;

public class Example2 {
    private int a;
    private int b;
    private int c;

    Example2 (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getSum() {
        return a+b+c;
    }

    public void print() {
        System.out.printf("%d + %d + %d = ", a, b, c);
    }

    public static void main(String[] args) {
        Example2 x = new Example2(1, 2, 3);
        Example2 y = new Example2(2, 4, 6);
        int xs = x.getSum();
        int ys = y.getSum();
        x.print();
        System.out.println(xs);
        y.print();
        System.out.println(ys);
    }
}
