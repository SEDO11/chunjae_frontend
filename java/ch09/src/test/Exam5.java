package test;

class MyData {
    int data;
    synchronized void modifyData() {
        for(int i=0; i<10000; i++) {
            data++;
        }
        System.out.println(data);
    }
}

class MyThread extends Thread {
    MyData myData;
    public MyThread(MyData myData) {
        this.myData = myData;
    }

    @Override
    public void run() {
        myData.modifyData();
    }
}

public class Exam5 {
    public static void main(String[] args) {
        MyData md = new MyData();
        MyThread mt1 = new MyThread(md);
        mt1.start();

        MyThread mt2 = new MyThread(md);
        mt2.start();
    }
}
