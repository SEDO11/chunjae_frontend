package sec1;

class Chanwon {
    private int seq;
    private int data;

    public Chanwon() {
        this(1);
    }
    public Chanwon(int seq) {
        this(seq, 2);
    }

    public Chanwon(int seq, int data) {
        this.seq = seq;
        this.data = data;
    }
}

class Sehoon {
    private int num = 0;
    private String name = "";

    public int getNum() {
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

public class Chunjae {
    private int no;
    protected int point;
    int partno;
    public String name;
    public static final double PI = Math.PI;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
