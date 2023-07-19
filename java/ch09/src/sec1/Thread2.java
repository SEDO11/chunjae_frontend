package sec1;

class SMTread extends Thread {
    
    // 멀티 쓰레드 방식
    @Override
    public synchronized void start() { // 쓰레드 생성
        this.method1(); // 동기화 블록에 기재된 쓰레드는 병행 수행 된다.
        super.start();
    }

    @Override
    public void run() { // 쓰레드로 실행할 내용 기술
        int[] arr = {95, 60, 85, 70, 90, 80};
        String[] str = {"김기태", "이슬비", "박나연", "박진원", "오태훈", "신승원"};
        for(int i=0; i<arr.length; i++) {
            System.out.printf("이름: %s \t점수: %d\n", str[i], arr[i]); // 전체 쓰레드는 6개
            try {
                // 대기 시간을 부여하고, 지정한 밀리초 만큼 기다리며 그 시간이 지나면 자동으로 다시 실행
                Thread.sleep(1000); // 싱글 쓰레드
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public  void method1() {
        for(int i=1; i<7; i++) {
            System.out.println(i);
            try {
                // 대기 시간을 부여하고, 지정한 밀리초 만큼 기다리며 그 시간이 지나면 자동으로 다시 실행
                Thread.sleep(500); // 싱글 쓰레드
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        SMTread smt = new SMTread();
        smt.start(); // 쓰레드 생성
    }
}
