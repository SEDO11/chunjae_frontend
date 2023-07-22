package sec2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

// stack과 queue의 장점을 혼합한 2중 구조
public class DequeEx1 {

    public static void main(String[] args) {
        Deque<String> deq1 = new ArrayDeque<>();
        Deque<String> deq2 = new LinkedBlockingDeque<>();
        Deque<String> deq3 = new ConcurrentLinkedDeque<>();
        Deque<String> deq4 = new LinkedList<>();
        
        // 요소 추가
        deq1.addFirst("1");
        deq1.addLast("8");
        deq1.push("2");
        deq1.offer("4");
        deq1.add("12");
        deq1.offerFirst("7");
        deq1.offerLast("9");
        System.out.println(deq1);
        
        //값 접근
        System.out.println(deq1.peek());
        System.out.println(deq1.peekFirst());
        System.out.println(deq1.peekLast());
        System.out.println(deq1.getFirst());
        System.out.println(deq1.getLast());
        
        // 요소 삭제
        deq1.pop();
        System.out.println(deq1);
        deq1.remove();
        System.out.println(deq1);
        deq1.removeLast();
        System.out.println(deq1);
        deq1.removeFirst();
        System.out.println(deq1);
        deq1.poll();
        System.out.println(deq1);
        deq1.pollFirst();
        System.out.println(deq1);
        deq1.pollLast();
        System.out.println(deq1);

    }

}
