package sec1;

@FunctionalInterface
interface Lambda3 {
    String print();
}
public class LambdaEx3 {
    public static void main(String[] args) {
        Lambda3 lam3 = () -> {
            return "홍길동";
        };
        String s = lam3.print();
        System.out.println(s);
    }
}
