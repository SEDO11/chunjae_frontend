package sec2;

import java.util.Date;

public class Exam13 {
}

class Notice implements Board {
    @Override
    public void insert(int bno, String title, String content, Date resdate) {

    }

    @Override
    public void select(int bno) {

    }

    @Override
    public void update(int bno, String title, String content) {

    }

    @Override
    public void delete(int bno) {

    }
}

interface Board {
    public void insert(int bno, String title, String content, Date resdate);
    public void select(int bno);
    public void update(int bno, String title, String content);
    public void delete(int bno);

}
