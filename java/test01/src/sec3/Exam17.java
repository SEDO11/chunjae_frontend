package sec3;

import java.util.ArrayList;

public class Exam17 {
    public static void main(String[] args) {
        ArrayList<Board> boardList = new ArrayList<>();
        for(int i=0; i<10; i++) {
            Board board = new Board("제목"+i,"내용"+i);
            boardList.add(board);
        }
    }
}

class Board {
    private String title;
    private String content;
    public Board() {}
    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public String getTitle() {return title;}
    public String getContent() {return content;}
}
