package sec1;

// 싱글 쓰레드
public class Thread1 {
    public static void main(String[] args) {
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
        System.out.println("종료");
    }
}
