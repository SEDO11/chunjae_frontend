package sec2;

public class Exam16 {
    public static void main(String[] args) {
        Container<String> con1 = new Container<>();
        con1.set("홍길동");
        String str = con1.get();
        System.out.println(str);

        Container<Integer> con2 = new Container<>();
        con2.set(6);
        int value = con2.get();
        System.out.println(value);
    }
}

class Container<T> {
    T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}
