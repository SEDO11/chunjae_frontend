package sec1;

public class Element extends Score{
    private int fun;

    public Element(int fun) {
        this.fun = fun;
    }
    
    // 오버라이딩
    public Element(int num, int fun) {
        super(num);
        this.fun = fun;
    }

    public Element(int num, String name, int kor, int eng, int mat, int fun) {
        super(num, name, kor, eng, mat);
        this.fun = fun;
    }

    public int getFun() {
        return fun;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }
}
