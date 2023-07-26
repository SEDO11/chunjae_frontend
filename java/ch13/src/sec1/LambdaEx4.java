package sec1;

// Operator
@FunctionalInterface
interface MyLambda4 {
    String print(String name);
}

public class LambdaEx4 {
    public static void main(String[] args) {
        MyLambda4 lam4 = name -> {
            return name;
        };
        String name = lam4.print("홍길동");
        System.out.println("내 이름은 : " + name);
    }
}
