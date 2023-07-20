package sec2;

// Runnable : 실행 가능한 객체를 만들기 위한 인터페이스 -> 사용자가 상속받아 새로운 클래스를 생성해서 사용

// 출석 체크
class SBRunAble implements Runnable {
    private int s1 = 1000;
    private int s2 = 1000;
    @Override
    public void run() {
        String[] str = {"김기태", "이슬비", "박나연", "박진원", "오태훈", "신승원", "백준철", "구예진", "오세훈"};
        try {
            Thread.sleep(s1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        // 출석 부르기
        for (int i=0; i<str.length; i++) {
            System.out.printf("출석체크 : %s\n", str[i]);
            try {
                Thread.sleep(s2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// 퇴실 체크
class SCRunAble implements Runnable {
    private int s1 = 500;
    private int s2 = 1500;
    @Override
    public void run() {
        String[] str = {"김기태", "이슬비", "박나연", "박진원", "오태훈", "신승원", "백준철", "구예진", "오세훈"};
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 출석 부르기
        for (int i=0; i<str.length; i++) {
            System.out.printf("퇴실체크 : %s\n", str[i]);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// 0.5초 퇴실체크가 더 빨라서 퇴실체크가 먼저 처리된다.
// 멀티 쓰레드 구조
public class Run1 {
    public static void main(String[] args) {
        Runnable sbr = new SBRunAble();
        Thread t1 = new Thread(sbr);
        t1.start();

        sbr = new SCRunAble();
        Thread t2 = new Thread(sbr);
        t2.start();
    }
}
