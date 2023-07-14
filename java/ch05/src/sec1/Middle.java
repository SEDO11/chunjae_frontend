package sec1;

public class Middle extends Score{
    private int history;

    public  Middle () {
        super(); // 부모 클래스 호출
    }

    public Middle(int history) {
        this.history = history;
    }

    public Middle(int num, int history) {
        super(num);
        this.history = history;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void proPoint() {
        System.out.println(super.getNum());
    }
}
