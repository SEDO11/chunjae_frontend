package sec2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        
        // que에 데이터 입력
        que.offer("0");
        que.offer("1");
        que.offer("2");
        que.offer("4");
//        que.add("8");
        System.out.println(que);
        
        // que에 데이터 추출
        que.poll();
        System.out.println(que);
    }
}
