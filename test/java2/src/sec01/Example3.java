package sec01;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float f1 = 0.0f;
        float f2 = 0.0f;
        String s1 = null;
        System.out.print("첫 번째 수: ");
        f1 = Float.parseFloat(sc.nextLine());
        System.out.print("두 번째 수: ");
        f2 = Float.parseFloat(sc.nextLine());
        System.out.println("---------------------");

        if(f1 == 0.0f || f2 == 0.0f) {
            s1 = "무한대";
        } else {
            s1 = String.valueOf(f1/f2);
        }
        System.out.println(s1);
    }
}
