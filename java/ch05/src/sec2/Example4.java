package sec2;

import sec1.Board;
import sec1.Qna;

public class Example4 {
    public static void main(String[] args) {
        Qna q1 = new Qna();
        
        q1.setTitle(q1.DUMMY);
        System.out.println(q1.getTitle()+1);

        Qna q2 = new Qna();
        q2.setTitle(Qna.DUMMY);
        System.out.println(q2.getTitle()+1);

    }
}
