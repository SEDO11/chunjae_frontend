package sec1;


import java.util.ArrayList;
import java.util.List;

public class Exam17 {
    public static void main(String[] args) {
        List<Board2> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            Board2 b = new Board2("타이틀"+i, "내용"+i);
            list.add(b);
        }
    }
}
class Board2{
    private String title;
    private String content;

    Board2() {}
    Board2(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
