package sec1;

public class Board {
    private int num;
    private String title;
    private String content;
    private String date;
    private int viewCount;

    public Board() {}

    public Board(int num) {
        this(num, "title1");
    }

    public Board(int num, String title) {
        this(num, title, "content1");
    }

    public Board(int num, String title, String content) {
        this(num, title, content, "2023-07-14");
    }

    public Board(int num, String title, String content, String date) {
        this(num, title, content, date, 0);
    }

    public Board(int num, String title, String content, String date, int viewCount) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.date = date;
        this.viewCount = viewCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public final static void method1() {
        System.out.println("여기는 Board1 입니다.");
    }

    public void method2() {
        System.out.println("여기는 Board2 입니다.");
    }

    public static void method3() {
        System.out.println("여기는 Board3 입니다.");
    }
}
