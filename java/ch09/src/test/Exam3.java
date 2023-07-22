package test;

public class Exam3 {
    public static void main(String[] args) {
        Thread th = new Thread();
        System.out.println(th.getName());
        System.out.println(Thread.activeCount());

        Thread t1 = new Thread();
        System.out.println(t1.getName());

        Thread t2 = new Thread();
        System.out.println(t2.getName());
    }
}
