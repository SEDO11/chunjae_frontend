package sec2;

import sec1.Board;
import sec1.Member;
import sec1.Qna;

public class Example3 {
    public static void main(String[] args) {
        Board b = new Board();
        Qna q = new Qna();

        // static은 클래스를 통해 접근
        Board.method1();
        b.method2();
        Board.method3();
    }
}
