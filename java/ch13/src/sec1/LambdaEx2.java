package sec1;

// consumer
@FunctionalInterface
interface MyLambda2 {
    void print(int x);
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyLambda1 lam1 = () -> {
            System.out.println("람다2");
        };
        lam1.print();

        MyLambda2 lam2 = (x) -> {
            System.out.println("내 나이는 : "+x);
        };
        lam2.print(26); // 매개변수는 여기에 대입
    }
}
