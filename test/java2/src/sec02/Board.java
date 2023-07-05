package sec02;

public class Board {
    private String title;
    private String content;
    private String writer;
    private String date;
    private int hitcount;

    Board(String title, String content) {
        this(title, content, null, null, 0);
    }

    Board(String title, String content, String writer) {
        this(title, content, writer, null, 0);
    }

    Board(String title, String content, String writer, String date, int hitcount) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = hitcount;
    }
}
