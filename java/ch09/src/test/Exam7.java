package test;

class MyThread2 extends Thread {
    public void run() {
        try {
            System.out.println("첫 번째 출력");
            Thread.sleep(1000);
            System.out.println("두 번째 출력");
            Thread.sleep(1000);
            System.out.println("세 번째 출력");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("쓰레드 종료");
        }
    }
}

public class Exam7 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        mt.start();
        try {
            mt.sleep(1500);
        } catch (InterruptedException e) {
        }
        //  Thread의 interrupt() 메소드는 스레드가 일시 정지 상태에 있을 때
        //  InterruptedException 예외를 발생시키는 역할을 한다.
        //  이것을 이용하면 Thread의 run() 메소드를 정상 종료시킬 수 있다.
        mt.interrupt();
    }
}
