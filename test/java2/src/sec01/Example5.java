package sec01;

import java.util.Scanner;

public class Example5 {
    // 별찍기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = Integer.parseInt(sc.nextLine());
        star(n);
    }

    public static void star(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
