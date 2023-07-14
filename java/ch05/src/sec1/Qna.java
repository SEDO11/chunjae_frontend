package sec1;

public class Qna extends Board{
    // 상수는 무조건 public
    public static final String DUMMY = "테스트글 제목";
    private int level; // level 0 본글, 1 답글, 2 1의 답글, ...
    private int parno;

    public Qna() { super(); }

    public Qna(int level) {
        super(level);
    }

    public Qna(int num, String title, String content, String date, int viewCount, int level, int parno) {
        super(num, title, content, date, viewCount);
        this.level = level;
        this.parno = parno;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParno() {
        return parno;
    }

    public void setParno(int parno) {
        this.parno = parno;
    }




}
