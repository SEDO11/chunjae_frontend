package test;

class My3 {
    public <T> T method(T t) {
        return t;
    }
}
public class Test2 {
    public static void main(String[] args) {
        My3 m = new My3();
        String s = m.<String>method("안녕");
        System.out.println(s);
    }
}
