package sec1;

public class Exam16 {
    public static void main(String[] args) {
        Container2<String> co1 = new Container2<>();
        co1.setT("홍길동");
        System.out.println(co1.getT());

        Container2<Integer> co2 = new Container2<>();
        co2.setT(6);
        System.out.println(co2.getT());
    }
}
class Container2<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
