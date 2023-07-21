package sec1;

import java.util.List;
import java.util.Vector;

class Qna {
    private int qno;
    private String title;
    private String contents;

    public Qna(int qno, String title, String contents) {
        this.qno = qno;
        this.title = title;
        this.contents = contents;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

public class ListEx5 {
    public static void main(String[] args) {
        List<Qna> q = new Vector<>();
        for (int i=1; i<10; i++) {
            q.add(new Qna(i, "제목"+i, "내용"+i));
        }
        for (Qna q1: q
             ) {
            System.out.printf("%d %s %s\n",q1.getQno(), q1.getTitle(), q1.getContents());
        }
    }
}
