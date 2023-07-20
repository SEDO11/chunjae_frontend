package sec1;

import java.util.ArrayList;
import java.util.List;

// ArrayList -> 각각의 값을 하나로 그룹화 해서 저장할 때 사용

public class ListEx1 {
    public static void main(String[] args) {
        Board bd1;
        String[] author = {"김", "이", "박", "최", "오"};
        ArrayList<Board> lst = new ArrayList<>(); // Board 클래스의 값을 받는 ArrayList 객체 선언
        for (int i=0; i<5; i++) {
            bd1 = new Board();
            bd1.setNo(i+1);
            bd1.setTitle("더미 제목");
            bd1.setContent("더미 글");
            bd1.setAuthor(author[i]);
            bd1.setResdate("2023-07-20");
            lst.add(bd1);
        }
        prt(lst);
    }

    public static void prt(ArrayList<Board> lst) {
        // 하나씩 빼서 하는 경우
//        Board bd2 = lst.get(2);
//        System.out.println("글 번호 : " + bd2.getNo());
//        System.out.println("글 제목 : " + bd2.getTitle());
//        System.out.println("작성자 : " + bd2.getAuthor());
//        System.out.println("작성 일 : " + bd2.getResdate());
        
        // for문을 이용해 전체를 빼서 하는 경우
        for(Board bd: lst) {
            System.out.println("글 번호 : " + bd.getNo());
            System.out.println("글 제목 : " + bd.getTitle());
            System.out.println("작성자 : " + bd.getAuthor());
            System.out.println("작성 일 : " + bd.getResdate());
            System.out.println();
        }
    }

}
