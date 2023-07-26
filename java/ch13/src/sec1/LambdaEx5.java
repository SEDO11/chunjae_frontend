package sec1;

import java.util.Scanner;

// Operator
@FunctionalInterface
interface MyLambda5 {
    int print(String a);
}
public class LambdaEx5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MyLambda5 lam5 = (a) -> {
            return Integer.parseInt(a);
        };
        String s = sc.nextLine();
        int v = lam5.print(s);
        System.out.println(s+"의 제곱 : " + Math.pow(v, 2));
    }
}
