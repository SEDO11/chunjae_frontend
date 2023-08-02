package sec2;

import java.util.ArrayList;
import java.util.List;

public class Exam17 {
    public static void main(String[] args) {
        List<Board2> BoardList = new ArrayList<>();
        for(int i=0; i<10; i++) {
            Board2 b2 = new Board2();
            BoardList.add(b2);
        }
    }
}

class Board2 {
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
